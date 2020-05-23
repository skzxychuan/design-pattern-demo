package status_pattern;

public class StatusTwo implements AbstractStatus {
    //每个状态也持有当前系统的引用
    private MySystem mySystem;

    public StatusTwo(MySystem mySystem) {
        this.mySystem = mySystem;
    }

    public void doSwitch() {
        System.out.println("状态2 =====》 状态1");
        mySystem.setCurStatus(mySystem.getStatusOne());
    }
}
