import java.util.List;

public class RestaurantDB {
    List<Restaurant> restaurantList;
    // add MenuDB here

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public Restaurant getRestaurantInfo(int id) {
        for(Restaurant restaurant:restaurantList) {
            if(restaurant.getId() == id) {
                return restaurant;
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
        return getRestaurantInfo(id).getWaitTime();
    }


}
