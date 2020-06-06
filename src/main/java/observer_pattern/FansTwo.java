package observer_pattern;

public class FansTwo implements MyObserver {

    private Subject subject;

    public FansTwo() { }

    public void setSubject(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
        System.out.println("粉丝2：订阅了主播");
    }

    public void doSomething() {
        System.out.println("粉丝2：我收到了主播上线的通知， 可我作业没做完，不能收看直播");
    }
}
