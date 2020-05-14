package strategy_pattern;

import lombok.Data;

@Data
public class Player {
    Weapon weapon;
    
    public Player() {
        weapon = new Sword();
    }

    public void useWeapon() {
        weapon.equipped();
    }

    /**
     * //如果没有使用策略模式，你很可能要这样写(伪代码)：
     *     if (武器 == 长剑) {
     *         doSomething();
     *     } else if (武器 == 弓箭) {
     *         doSomething();
     *     } else if (武器 == 锤子) {
     *         doSomething();
     *     }
     *
     * //虽然写大量if也能正常运行，但这不够优雅，没有发挥OOB语言的特性(继承/封装/抽象/多态)，也难以维护。
     * //玩家可以选择不同的武器，所以武器对玩家来说是“变化的”，根据封装变化的设计原则，应该将武器单独抽出来。
     * //而任何具体的武器都是可以被装备的，因此可以设计一个接口，将装备这个动作放到接口里，具体的武器实现不同的效果。
     * //任何玩家都可以持有一个 “武器对象”，根据针对接口/抽象超类编程的设计原则，应该要持有一个"武器接口"。
     * //这样就实现了武器效果代码和玩家代码的分离，在需要修改或添加武器效果的时候，只需要修改或添加具体的武器类，玩家类的代码不需要动。
     */
    
    public static void main(String[] args) {
        Player player = new Player();
        player.useWeapon();

        player.setWeapon(new Bow());
        player.useWeapon();

        player.setWeapon(new Hammer());
        player.useWeapon();
    }
}
