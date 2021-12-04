public class Menu {
    private int id; // add to DCD
    private String menu;
    private int restaurantId;

    public Menu(int menuId, String menu, float price, int restaurantId) {
        this.id = menuId;
        this.menu = menu;
        this.restaurantId = restaurantId;
    }

    public int getMenuId() {
        return this.id;
    }

    public void setMenuID(int menuId) {
        this.id = menuId;
    }

    public String getMenu() {
        return this.menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getRestaurantId() {
        return this.restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }
}
