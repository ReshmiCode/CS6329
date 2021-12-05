
public class MenuItem {
	private int id;
	private String name;
	private float price;

	public MenuItem(int menuId,String name, float price) {
		this.id =menuId;
		this.name=name;
		this.price=price;
	}
	 
	 public int getId() {return id;}
	 
	 public void setMenuID(int menuId) {this.id =menuId;}
	 
	 public String getName() {return name;}
	 
	 public void setName(String name) {this.name=name;}
	 
	 public float getPrice() {return price;}
	 
	public void setPrice (float price) {this.price=price;}
		
}
