package template_pattern;

/**
 * 抽象的咖啡因饮料类，表示所有咖啡因饮料
 */
public abstract class CaffeineBeverage {

    //咖啡因饮料的共同冲泡步骤(框架), 声明final，不许子类改变
    public final void prepareRecipe() {
        //1. 烧水
        boilWater();
        //2. 冲泡
        brewBevarage();
        //3. 倒进杯子
        pourInCup();
        //4. 加调料，可以被钩子干预
        if (condimentsHook()) {
            addCondiments();
        }
    }

    //共性： 冲泡咖啡因饮料都需要先烧水，声明为final，不允许字类覆盖
    public final void boilWater() {
        System.out.println("烧水......");
    }

    //冲泡，具体是冲泡什么由具体字类决定
    public abstract void brewBevarage();

    //共性： 所有的饮料都需要倒进杯子里，声明final
    public final void pourInCup() {
        System.out.println("倒进杯子......");
    }

    //添加其他调料，加什么调料字类自己定
    public abstract void addCondiments();

    //钩子：空的或者默认的方法实现，用来干涉步骤(框架)，字类自行决定要不要覆盖
    public boolean condimentsHook() {
        return true;
    }
}
