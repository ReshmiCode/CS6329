import java.util.ArrayList;
import java.util.List;

public class UTD_Cafeteria {
    private int capacity;
    private int operatingTime;
    private int noOfChairs;
    private int noOfTables;
    private List<Order> paidOrders;

    public UTD_Cafeteria() {
        paidOrders = new ArrayList<>();
    }

    public void addOrder(Order order) { // update DCD
        paidOrders.add(order);
    }
}
