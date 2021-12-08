import java.util.List;

public class Controller {
    private int id;
    private UTDGalaxy galaxy;
    private RestaurantDB restaurantDB;
    private Payment_Service paymentService;

    private Order currentOrder;
    private CustomerRecord userCurrentOrdering = null; // DCD?

    public Controller() {
        id = 1; // make random ig
        galaxy = new UTDGalaxy();
        restaurantDB = new RestaurantDB();
        paymentService = new Payment_Service();
    }

    public List<Restaurant> logIn(String email, String password) {
        int userId = galaxy.validateLogIn(email, password);
        if(userId == -1) return null;
        userCurrentOrdering = galaxy.getRecord(userId);
        return restaurantDB.getRestaurantList();
    }

    public String viewRestaurant(int id) {
        return restaurantDB.getRestaurantInfo(id);
    }

    public Menu finalizeRestaurant(int id) {
        Menu menu = restaurantDB.getMenu(id);
        currentOrder = new Order(userCurrentOrdering.getId(), id);
        return menu;
    }

    public Order addItem(int id, int quantity) {
        MenuItem item = restaurantDB.getMenuItemDetails(id);
        if(item == null) return null;
        currentOrder.addOrderItem(item.getName(), item.getPrice(), quantity);
        return currentOrder;
    }

    public String[] finalizeOrder() {
        double price = currentOrder.getTotalPrice();
        Bill bill = currentOrder.createBill(price);
        int waitTime = restaurantDB.getWaitTime(currentOrder.getRestaurantId()); // update UC realization

        String [] tuple = new String[2];
        tuple[1] = bill.toString();
        tuple[0] = "Wait time: " + waitTime + " minutes";
        return tuple;
    }

    public boolean makePayment(String creditCardInfo) {
        if(!paymentService.isValid(creditCardInfo)) return false;
        currentOrder.makePayment(creditCardInfo);
        return true;
    }
}
