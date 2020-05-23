package status_pattern;

import lombok.Data;

/**
 * 一个有三种状态的系统
 */
@Data
public class MySystem {
    //系统可能的状态
    AbstractStatus statusOne;
    AbstractStatus statusTwo;
    AbstractStatus statusThree;
    //当前状态：
    AbstractStatus curStatus;

    public MySystem() {
        statusOne = new StatusOne(this);
        statusTwo = new StatusTwo(this);
        statusThree = new StatusThree(this);
        //初始状态
        curStatus = statusOne;
    }

    //将系统的状态切换动作委托给当前状态类
    public void doSwitch() {
        curStatus.doSwitch();
    }

    public static void main(String[] args) {
        MySystem mySystem = new MySystem();

        // 用户3次调用同样的方法，每次输出的结果都不同
        // 就好像类的逻辑居然能自行变化，系统自己知道该怎么切换状态
        mySystem.doSwitch();
        mySystem.doSwitch();
        mySystem.doSwitch();
    }
}
