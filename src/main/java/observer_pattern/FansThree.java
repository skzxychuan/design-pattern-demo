package observer_pattern;

public class FansThree implements MyObserver {

    private Subject subject;

    public FansThree() { }

    public void setSubject(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
        System.out.println("粉丝3：订阅了主播");
    }

    public void doSomething() {
        System.out.println("粉丝3：我收到了主播上线的通知， 我这就去他的直播页面");
    }
}
