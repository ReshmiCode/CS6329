import java.util.List;

public class Controller {
    private int id;
    private UTDGalaxy galaxy;
    private RestaurantDB restaurantDB;

    private CustomerRecord userCurrentOrdering = null; // DCD?

    public Controller() {
        id = 1; // make random ig
        galaxy = new UTDGalaxy();
        restaurantDB = new RestaurantDB();
    }

    public List<Restaurant> logIn(String email, String password) { // update DCD with type
        int userId = galaxy.validateLogIn(email, password);
        if(userId == -1) return null;
        userCurrentOrdering = galaxy.getRecord(userId);
        return restaurantDB.getRestaurantList();
    }

    public String viewRestaurant(int id) { // update DCD with type
        return restaurantDB.getRestaurantInfo(id);
    }

    public void finalizeRestaurant(int id) {
        restaurantDB.getMenu(id);
    }
}
