public class CustomerRecord
{
	private String name;
	private int id;
	private String email;
	private String password;
	private int phone_number;

	public CustomerRecord(String name, int id, String email, String password, int phone_number) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.password = password;
		this.phone_number = phone_number;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name=name;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id=id;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email=email;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password=password;
	}

	public int getPhoneNo()
	{
		return phone_number;
	}

	public void setPhoneNo(int phone_number)
	{
		this.phone_number=phone_number;
	}
}
