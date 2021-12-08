import java.util.ArrayList;
import java.util.List;

public class MenuDB {
    private List<Menu> menuList;

    public MenuDB() {
        menuList = new ArrayList<>();

        List<MenuItem> moesItems = new ArrayList<>();
        moesItems.add(new MenuItem(1,"Burrito",3.99));
        moesItems.add(new MenuItem(2,"Bowl",6.77));
        moesItems.add(new MenuItem(3,"Stacks",4.5));
        moesItems.add(new MenuItem(4,"Quesadillas",7.89));
        moesItems.add(new MenuItem(5,"Meal Kits",8.49));
        menuList.add(new Menu(1, moesItems, 1));
        List<MenuItem> PandaExpress = new ArrayList<>();
        PandaExpress.add(new MenuItem(1,"Plate",4.99));
        PandaExpress.add(new MenuItem(2,"Bowl",5.77));
        PandaExpress.add(new MenuItem(3,"Chow Mein",3.5));
        PandaExpress.add(new MenuItem(4,"Original Orange Chicken",5.89));
        PandaExpress.add(new MenuItem(5,"Black Pepper Steak",6.49));
        menuList.add(new Menu(2, PandaExpress, 2));
    }

    public Menu getMenu(int id){
        for(Menu menu: menuList) {
            if(menu.getMenuId() == id) return menu;
        }
        return null;
    }

    public MenuItem getMenuItem (int id){
        for(Menu menu: menuList) {
            if(menu.getMenuItem(id) != null) return menu.getMenuItem(id);
        }
        return null;
    }
}
