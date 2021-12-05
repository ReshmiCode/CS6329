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
