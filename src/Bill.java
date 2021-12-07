import java.util.Date;

public class Bill
{
	private Date date;
	private double amount;
	private int id;

	public Bill(double amount, int id) {
		this.amount = amount;
		this.id = id;
		date = new Date();
	}

	public String toString() {
		return "Amount due: $" + String.format("%1.2f", amount) + " on " + date.toString();
	}

	public Double getAmount()
	{
		return amount;
	}
	public void setAmount(Double amount) { this.amount=amount; }
	public int getId()
	{
		return id;
	} 
	public void setId(int id)
	{
		this.id=id;
	}
}
