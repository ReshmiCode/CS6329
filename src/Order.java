import java.util.List;

public class Order {
    private int id;
    private int restaurantId;
    private long timeStamp;
    private double price;
    private boolean isPaidFor;
    List<String> orderItems; // replace with OrderItem class
    private long waitingTime;
    private int customerId;

    public Order addOrderItem(String name, double price, int quantity) {
        // create Order
        orderItems.add("hi");
        return this;
    }

    public double getTotalPrice() {
        double price = 0;
        for(String item: orderItems) {
            price += 0; // item.getPrice()
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

    public void makePayment(String creditCard) {
        Payment made = new Payment(price, id, true, creditCard);
    }
}
