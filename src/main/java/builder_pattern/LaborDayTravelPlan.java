package builder_pattern;

import java.util.Date;

/**
 * 2. 具体的某个旅游计划，比如五一
 */
public class LaborDayTravelPlan implements TravelPlan {
    private Date from;
    private Date to;
    private String destination;
    private String[] route;
    private String hotel;
    private String restaurant;

    public void setDays(Date from, Date to) {
        this.from = from;
        this.to = to;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setRoute(String[] route) {
        this.route = route;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("days: ").append(from.toString()).append("\t").append(to.toString()).append("\n");
        sb.append("destination: ").append(destination).append("\n");
        sb.append("route: ");
        for (String r : route) {
            sb.append(r).append(" ");
        }
        sb.append("\n");
        sb.append("hotel: ").append(hotel).append("\n");
        sb.append("restaurant: ").append(restaurant).append("\n");

        return sb.toString();
    }
}
