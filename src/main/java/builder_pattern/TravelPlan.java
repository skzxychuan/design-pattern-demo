package builder_pattern;

import java.util.Date;

/**
 * 1. 旅游计划接口，包括了时间、目的地、路线、酒店、餐饮等安排
 */
public interface TravelPlan {
    void setDays(Date from, Date to);
    void setDestination(String destination);
    void setRoute(String[] route);
    void setHotel(String hotel);
    void setRestaurant(String restaurant);
}
