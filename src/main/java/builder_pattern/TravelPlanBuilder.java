package builder_pattern;

import java.util.Date;

/**
 * 3. builder接口
 */
public interface TravelPlanBuilder {
    TravelPlanBuilder buildDays(Date from, Date to);
    TravelPlanBuilder buildDestination(String destination);
    TravelPlanBuilder buildRoute(String[] route);
    TravelPlanBuilder buildHotel(String hotel);
    TravelPlanBuilder buildRestaurant(String restaurant);
    TravelPlan build();
}
