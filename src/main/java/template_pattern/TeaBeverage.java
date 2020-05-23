package template_pattern;

import lombok.Data;

@Data
public class TeaBeverage extends CaffeineBeverage {
    Boolean wantWolfberry = true;

    public void brewBevarage() {
        System.out.println("冲泡茶叶......");
    }

    public void addCondiments() {
        System.out.println("注重养生,加枸杞......");
    }

    // 只想喝杯浓茶而已, 不覆盖的话默认加枸杞
    @Override
    public boolean condimentsHook() {
        return wantWolfberry;
    }

    public static void main(String[] args) {
        System.out.println("来杯加糖咖啡============：");
        CaffeineBeverage caffeineBeverage = new CoffeeBeverage();
        caffeineBeverage.prepareRecipe();

        System.out.println("来杯原味咖啡============：");
        caffeineBeverage = new CoffeeBeverage();
        ((CoffeeBeverage) caffeineBeverage).setWantSugar(false);
        caffeineBeverage.prepareRecipe();

        System.out.println("来杯养生茶============：");
        caffeineBeverage = new TeaBeverage();
        caffeineBeverage.prepareRecipe();

        System.out.println("来杯茶就行============：");
        caffeineBeverage = new TeaBeverage();
        ((TeaBeverage) caffeineBeverage).setWantWolfberry(false);
        caffeineBeverage.prepareRecipe();
    }
}
