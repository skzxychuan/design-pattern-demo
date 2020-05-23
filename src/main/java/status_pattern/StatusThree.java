package status_pattern;

public class StatusThree implements AbstractStatus {
    //每个状态也持有当前系统的引用
    private MySystem mySystem;

    public StatusThree(MySystem mySystem) {
        this.mySystem = mySystem;
    }

    public void doSwitch() {
        System.out.println("状态3 =====》 状态2");
        mySystem.setCurStatus(mySystem.getStatusTwo());
    }
}
