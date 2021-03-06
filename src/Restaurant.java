import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private int id;
    private int menuId;
    private String name;
    private int waitTime;
    private String desc;
    private List<Order> orders;

    public Restaurant(int id, int menuId, String name, int waitTime, String desc) {
        this.id = id;
        this.menuId = menuId;
        this.name = name;
        this.waitTime = waitTime;
        this.desc = desc;
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMenuId() {
        return this.menuId;
    }

    public void setMenuID(int menuId) {
        this.menuId = menuId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWaitTime() { return this.waitTime; }

    public String getDesc() {
        return this.desc;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }
}
