import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private int restaurantId;
    private Date timeStamp;
    private double price;
    private boolean isPaidFor;
    List<OrderItem> orderItems;
    private int waitingTime;
    private int customerId;

    public Order(int customerId, int restaurantId) {
        this.customerId = customerId;
        this.restaurantId = restaurantId;
        isPaidFor = false;
        orderItems = new ArrayList<>();
        waitingTime = -1;
        price = 0;
        id = 1;
        timeStamp = new Date();
    }

    public String toString() {
        String res = "Order:\n";
        for(OrderItem items : orderItems) {
            res += items.toString();
            res += "\n";
        }
        return res;
    }

    public void addOrderItem(String name, double price, int quantity) {
        OrderItem curr = new OrderItem(name, price, quantity);
        orderItems.add(curr);
    }

    public double getTotalPrice() {
        double price = 0;
        for(OrderItem item: orderItems) {
            price += item.getPrice()*item.getQuantity();
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
        isPaidFor = true;
    }
}
