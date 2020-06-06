package observer_pattern;

import lombok.Data;

@Data
public class FansOne implements MyObserver {

    private Subject subject;

    public FansOne() { }

    public void setSubject(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
        System.out.println("粉丝1：订阅了主播");
    }

    public void doSomething() {
        System.out.println("粉丝1：我收到了主播上线的通知, 可我正在工作，不能收看直播");
    }
}
