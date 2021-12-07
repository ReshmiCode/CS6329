import java.util.ArrayList;
import java.util.List;

public class MenuDB {
    private List<Menu> menuList;

    public MenuDB() {
        menuList = new ArrayList<>();
        // add menus here
    }

    public Menu getMenu(int id){
        for(Menu menu: menuList) {
            if(menu.getMenuId() == id) return menu;
        }
        return null;
    }

    public MenuItem getMenuItem (int id){
        for(Menu menu: menuList) {
            for(MenuItem menuItem: menu.getMenu()) {
                if(menuItem.getId() == id) return menuItem;
            }
        }
        return null;
    }
}
