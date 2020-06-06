package observer_pattern;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

@Data
public class GameAnchor implements Subject{
    private List<MyObserver> observers;
    private Boolean online;
    private Boolean onlineStatusChange;

    public GameAnchor() {
        observers = new ArrayList<>();
        online = false;
        onlineStatusChange = false;
    }

    public void registerObserver(MyObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(MyObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        if (onlineStatusChange) {
            for (MyObserver observer : observers) {
                observer.doSomething();
            }
            setOnlineStatusChange(false);
        }
    }

    public void setOnline(Boolean bool) {
        online = bool;
        onlineStatusChanged();
    }

    private void onlineStatusChanged() {
        System.out.println("你关注的主播上线了！！！");
        setOnlineStatusChange(true);
        notifyObservers();
    }

    public static void main(String[] args) {
        //一个主播三粉丝
        GameAnchor subject = new GameAnchor();
        FansOne fansOne = new FansOne();
        FansTwo fansTwo = new FansTwo();
        FansThree fansThree = new FansThree();

        //订阅主播
        fansOne.setSubject(subject);
        fansTwo.setSubject(subject);
        fansThree.setSubject(subject);

        //主播上线
        subject.setOnline(true);

        /**
         * 运行结果:
         * 粉丝1：订阅了主播
         * 粉丝2：订阅了主播
         * 粉丝3：订阅了主播
         * 你关注的主播上线了！！！
         * 粉丝1：我收到了主播上线的通知, 可我正在工作，不能收看直播
         * 粉丝2：我收到了主播上线的通知， 可我作业没做完，不能收看直播
         * 粉丝3：我收到了主播上线的通知， 我这就去他的直播页面
         */
    }
}
