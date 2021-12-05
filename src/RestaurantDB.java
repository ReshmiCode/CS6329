import java.util.ArrayList;
import java.util.List;

public class RestaurantDB {
    List<Restaurant> restaurantList;
    // add MenuDB here

    public RestaurantDB() {
        restaurantList = new ArrayList<Restaurant>();
        restaurantList.add(new Restaurant(1, 1, "Moe's", 10, "Mexican food"));
        restaurantList.add(new Restaurant(2, 2, "Panda Express", 20, "Chinese food"));
    }

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public String getRestaurantInfo(int id) { // update DCD
        for(Restaurant restaurant:restaurantList) {
            if(restaurant.getId() == id) {
                return restaurant.getDesc();
            }
        }
        return null;
    }

    public Menu getMenu(int id) { // update DCD with type
        for(Restaurant restaurant:restaurantList) {
            if(restaurant.getMenuId() == id) {
                // get menu from DB
            }
        }
        return null;
    }

    public String getMenuItemDetails(int id) { // connect w/ class
        return "hi";
    }

    public long getWaitTime(int id) { // update DCD with type
        for(Restaurant restaurant:restaurantList) {
            if(restaurant.getId() == id) {
                return restaurant.getWaitTime();
            }
        }
        return 0;
    }


}
