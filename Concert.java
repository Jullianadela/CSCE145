
public class Concert {
	
	//Instance Variable
	private String bandName;
	private int capacity;
	private int numTicketsSoldByPhone;
	private int numTicketsSoldAtVenue;
	private double priceByPhone;
	private double priceAtVenue;
	
	//Default Constructor
	public Concert() 
	{
	this.bandName = "No Name Yet";
	this.capacity = 0;
	this.numTicketsSoldByPhone = 0;
	this.numTicketsSoldAtVenue = 0;
	this.priceByPhone = 0.0;
	this.priceAtVenue = 0.0;
	}
	
	//Parameterized Constructor 
	public Concert (String xBandName, int xCapacity, double xPriceByPhone, double xPriceAtVenue)
	{
		this.bandName = xBandName;
		this.capacity = xCapacity;
		this.priceByPhone = xPriceByPhone;
		this.priceAtVenue = xPriceAtVenue;
		
	}
	
	public Concert (String xBandName, int xCapacity, int xNumTicketsSoldByPhone, 
			int xNumTicketsSoldAtVenue, double xPriceByPhone, double xPriceAtVenue)
	{
		this.bandName = xBandName;
		this.capacity = xCapacity;
		this.numTicketsSoldByPhone = xNumTicketsSoldByPhone;
		this.numTicketsSoldAtVenue = xNumTicketsSoldAtVenue;
		this.priceByPhone = xPriceByPhone;
		this.priceAtVenue = xPriceAtVenue;
	}
	
	//Accessors
	public String getBandName()
	{
		return this.bandName;
	}
	
	public int getCapacity()
	{
		return this.capacity;
	}
	
	public int getNumTicketsSoldByPhone()
	{
		return this.numTicketsSoldByPhone;
	}
	
	public int getNumTicketsSoldAtVenue()
	{
		return this.numTicketsSoldAtVenue;
	}
	
	public double getPriceByPhone()
	{
		return this.priceByPhone;
	}
	
	public double getPriceAtVenue()
	{
		return this.priceAtVenue;
	}
	
	//Mutators
	public void setBandName(String xBandName)
	{
		this.bandName = xBandName;
	}
	public void setCapacity(int xCapacity)
	{
		//Checking if capacity is valid
		if (xCapacity > 0)
		{
		this.capacity = xCapacity;
		}
		
		else
		{
			System.out.println("Please enter a valid value");
		}
	}
	
	public void setNumTicketsSoldByPhone(int xNumTicketsSoldByPhone)
	{
		if (xNumTicketsSoldByPhone > 0)
		{
			this.numTicketsSoldByPhone = xNumTicketsSoldByPhone;
		}
		
		else
		{
			System.out.println("Please enter a valid value");
		}
	}
	
	public void setNumTicketsSoldAtVenue(int xNumTicketsSoldAtVenue)
	{
		if (xNumTicketsSoldAtVenue > 0)
		{
			this.numTicketsSoldAtVenue = xNumTicketsSoldAtVenue;
		}
		
		else
		{
			System.out.println("Please enter a valid value");
		}
	}
	
	public void setPriceByPhone(double xPriceByPhone)
	{
		if (xPriceByPhone > 0)
		{
			this.priceByPhone = xPriceByPhone;
		}
		
		else
		{
			System.out.println("Please enter a valid value");
		}
	}
	
	public void setPriceAtVenue(double xPriceAtVenue)
	{
		if (xPriceAtVenue > 0)
		{
			this.priceAtVenue = xPriceAtVenue;
		}
		
		else
		{
			System.out.println("Please enter a valid value");
		}
	}
	
	public int totalNumberOfTicketsSold()
	{
		return numTicketsSoldByPhone + numTicketsSoldAtVenue;
	}
	
	public int ticketsRemaining()
	{
		return this.capacity - totalNumberOfTicketsSold();
	}
	
	public void buyTicketsAtVenue(int num)
	{
		if(num > 0 && totalNumberOfTicketsSold() + num <= capacity)
		{
			this.numTicketsSoldAtVenue += num;
		}
		else
		{
			System.out.println("Not enough tickets remaining!");
		}
	}
	public void buyTicketsByPhone(int num)
	{
		if(num > 0 && totalNumberOfTicketsSold() + num <= capacity)
		{
			this.numTicketsSoldByPhone += num;
		}
		else
		{
			System.out.println("Not enough tickets remaining!");
		}
	}
	
	public double totalSales()
	{
		return (priceAtVenue * numTicketsSoldAtVenue) + (priceByPhone * numTicketsSoldByPhone);
	}
}
