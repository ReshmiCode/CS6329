
public class MenuItem {
	private int id;
	private String name;
	private double price; // update DCD

	public MenuItem(int menuId, String name, double price) {
		this.id =menuId;
		this.name=name;
		this.price=price;
	}

	public String toString() {
		return this.id + "\t" + name + "\t$" + price;
	}
	 
	 public int getId() {return id;}
	 
	 public void setMenuID(int menuId) {this.id =menuId;}
	 
	 public String getName() {return name;}
	 
	 public void setName(String name) {this.name=name;}
	 
	 public double getPrice() {return price;}
	 
	public void setPrice (float price) {this.price=price;}
		
}
