import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private int restaurantId;
    private long timeStamp;
    private double price;
    private boolean isPaidFor;
    List<OrderItem> orderItems; // replace with OrderItem class
    private long waitingTime;
    private int customerId;

    public Order(int customerId, int restaurantId) {
        this.customerId = customerId;
        this.restaurantId = restaurantId;
        isPaidFor = false;
        orderItems = new ArrayList<>();
        waitingTime = -1;
        price = 0;
        id = 1;
    }

    public String toString() {
        String res = "Order:\n";
        for(OrderItem items : orderItems) {
            res += items.toString();
            res += "\n";
        }
        return res;
    }

    public void addOrderItem(String name, double price, int quantity) { // update DCD
        OrderItem curr = new OrderItem(name, price, quantity);
        orderItems.add(curr);
    }

    public double getTotalPrice() {
        double price = 0;
        for(OrderItem item: orderItems) {
            price += item.getPrice();
        }
        this.price = price;
        return price;
    }

    public Bill createBill(double price) {
        return new Bill(price, this.id);
    }

    public long getWaitTime() {
        return waitingTime;
    }

    public int getRestaurantId() {return restaurantId;}

    public void makePayment(String creditCard) {
        Payment made = new Payment(price, id, true, creditCard);
    }
}
