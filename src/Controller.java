public class Controller {
    private int id;
    private UTDGalaxy galaxy;
    private RestaurantDB restaurantDB;

    public Controller() {
        id = 1; // make random ig
        galaxy = new UTDGalaxy();
        restaurantDB = new RestaurantDB();
    }

    public int logIn(String email, String password) { // update DCD with type
        return galaxy.validateLogIn(email, password);
    }

    public Restaurant viewRestaurant(int id) { // update DCD with type
        return restaurantDB.getRestaurantInfo(id);
    }
}
