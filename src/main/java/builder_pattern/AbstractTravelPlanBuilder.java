package builder_pattern;

import java.util.Date;

/**
 * 4. builder抽象类
 */
public abstract class AbstractTravelPlanBuilder implements TravelPlanBuilder {
    public abstract TravelPlanBuilder buildDays(Date from, Date to);
    public abstract TravelPlanBuilder buildDestination(String destination);
    public abstract TravelPlanBuilder buildRoute(String[] route);
    public abstract TravelPlanBuilder buildHotel(String hotel);
    public abstract TravelPlanBuilder buildRestaurant(String restaurant);
    public abstract TravelPlan build();
}
