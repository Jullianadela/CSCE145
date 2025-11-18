//Julliana Dela Cruz
public class Coffee {
	
	//Instance Variables
	private String name;
	private double caffeine;
	
	//Default Constructor
	public Coffee()
	{
		this.name = "none";
		this.caffeine = 50;
	}
	
	//Accessor 
	public String getName() 
	{
		return this.name;
	}
	
	public double getCaffeine()
	{
		return this.caffeine;
	}
	
	//Mutators
	public void setName(String xName)
	{
		if (xName == null || xName.equals(" ") || xName.length() == 0)
		{
			System.out.println("Please enter a name!");
			
			this.name = "none";	//Sets name to default if user does not enter a name
		}
		else 
		{
			this.name = xName;
		}
	}
	
	public void setCaffeine(double xCaffeine)
	{
		if (xCaffeine >= 50 && xCaffeine <= 300)
		{
			this.caffeine = xCaffeine;
		}
		
		else
		{
			System.out.println("Please enter a valid caffiene amount!");
			
			this.caffeine = 50;	//Sets caffeine to default if user does not enter a caffeine amount
		}
	}
		
	//Calculating dangerous amounts of coffee
	public double riskyAmount()
	{
		return 180.0 / ((this.caffeine / 100.0)*6.0);
	}
	
	//Output method
	public void writeOutput()
	{
	System.out.printf("It would take %.2f cups of " + 
	this.name + " before it’s dangerous to drink more.", riskyAmount());
	}
	
	}

