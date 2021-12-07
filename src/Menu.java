import java.util.List;

public class Menu {
    private int id; // add to DCD and remove menu string
    List<MenuItem> menuItems;
    private int restaurantId;

    public Menu(int menuId, List<MenuItem> menuItems, int restaurantId) {
        this.id = menuId;
        this.menuItems = menuItems;
        this.restaurantId = restaurantId;
    }

    public String toString() {
        String res = "";
        for(MenuItem item: menuItems) {
            res += item.toString();
            res += "\n";
        }
        return res;
    }

    public int getMenuId() {
        return this.id;
    }

    public void setMenuID(int menuId) {
        this.id = menuId;
    }

    public List<MenuItem> getMenu() {
        return this.menuItems;
    }

    public void setMenu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public int getRestaurantId() {
        return this.restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }
}
