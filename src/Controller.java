import java.util.List;

public class Controller {
    private int id;
    private UTDGalaxy galaxy;
    private RestaurantDB restaurantDB;

    private Order currentOrder;
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

    public Menu finalizeRestaurant(int id) { // update DCD
        Menu menu = restaurantDB.getMenu(id);
        currentOrder = new Order(userCurrentOrdering.getId(), id);
        return menu;
    }

    public Order addItem(int id, int quantity) { // update DCD
        MenuItem item = restaurantDB.getMenuItemDetails(id);
        currentOrder.addOrderItem(item.getName(), item.getPrice(), quantity);
        return currentOrder;
    }

    public void finalizeOrder() {
        double price = currentOrder.getTotalPrice();
        Bill bill = currentOrder.createBill(price);
        long waitTime = restaurantDB.getWaitTime(currentOrder.getRestaurantId()); // update UC realization
    }
}
