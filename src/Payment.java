import java.util.Date;

public class Payment {
	private Date date;
	private Double amount;
	private int billId;
	private Boolean status;
	private String creditCard;

	public Payment(Double amount, int billId, Boolean status, String creditCard) {
		this.amount = amount;
		this.billId = billId;
		this.status = status;
		this.creditCard = creditCard;
		this.date = new Date();
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getCreditInfo() {
		return creditCard;
	}

	public void setCreditInfo(String creditCard) {
		this.creditCard = creditCard;
	}
}
