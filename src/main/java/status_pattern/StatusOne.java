package status_pattern;

public class StatusOne implements AbstractStatus {
    //每个状态也持有当前系统的引用
    private MySystem mySystem;

    public StatusOne(MySystem mySystem) {
        this.mySystem = mySystem;
    }

    public void doSwitch() {
        System.out.println("状态1 =====》 状态3");
        mySystem.setCurStatus(mySystem.getStatusThree());
    }
}
