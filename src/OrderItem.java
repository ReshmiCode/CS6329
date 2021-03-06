public class OrderItem
{
	private String name;
	private double price;
	private int quantity;

	public OrderItem(String name, double price, int quantity)
	{
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String toString() {
		return name + "\t" + quantity;
	}

	public double getPrice()
	{
		return price;
	}
	public void setPrice(Double price)
	{
		this.price=price;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) { this.name=name; }
	public int getQuantity()
	{
		return quantity;
	}
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
}
