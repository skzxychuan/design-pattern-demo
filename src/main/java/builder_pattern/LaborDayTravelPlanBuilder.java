package builder_pattern;

import java.util.Date;

/**
 * 5. builder具体类
 */
public class LaborDayTravelPlanBuilder extends AbstractTravelPlanBuilder {
    private TravelPlan laborDayTravelPlan = new LaborDayTravelPlan();

    public TravelPlan build() {
        return  laborDayTravelPlan;
    }

    public TravelPlanBuilder buildDays(Date from, Date to) {
        laborDayTravelPlan.setDays(from, to);
        return this;
    }

    public TravelPlanBuilder buildDestination(String destination) {
        laborDayTravelPlan.setDestination(destination);
        return this;
    }

    public TravelPlanBuilder buildRoute(String[] route) {
        laborDayTravelPlan.setRoute(route);
        return this;
    }

    public TravelPlanBuilder buildHotel(String hotel) {
        laborDayTravelPlan.setHotel(hotel);
        return this;
    }

    public TravelPlanBuilder buildRestaurant(String restaurant) {
        laborDayTravelPlan.setRestaurant(restaurant);
        return this;
    }

    /**
     * 生成器(建造者)模式demo
     * 生成器模式的用途：一般被用来创建组合结构
     * 生成器模式的优点：
     * 1. 将一个复杂对象的创建过程封装起来
     * 2. 允许对象通过多个步骤来创建，并且可以改变过程(这和只有一个步骤的工厂模式不同)
     * @param args
     */
    public  static void main(String[] args) {
        TravelPlanBuilder builder = new LaborDayTravelPlanBuilder();

        TravelPlan travelPlan = builder.buildDays(new Date(), new Date())
                .buildDestination("guangzhou")
                .buildHotel("home")
                .buildRestaurant("home")
                .buildRoute(new String[]{"A", "B"})
                .build();

        System.out.println(travelPlan.toString());
    }
}
