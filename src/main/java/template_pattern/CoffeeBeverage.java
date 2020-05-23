package template_pattern;

import lombok.Data;

/**
 * 咖啡
 */
@Data
public class CoffeeBeverage extends CaffeineBeverage {
    Boolean wantSugar = true;

    public void brewBevarage() {
        System.out.println("冲泡咖啡......");
    }

    public void addCondiments() {
        System.out.println("原味咖啡太苦了，加糖......");
    }

    // 我又不想加糖了,不覆盖的话默认会加糖
    @Override
    public boolean condimentsHook() {
        return wantSugar;
    }

}
