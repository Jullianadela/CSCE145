
public class Car extends Vehicle {
	
	private double mileage;
	private int passengers;
	
	//Default Constructor
	public Car()
	{
		this.mileage = 0;
		this.passengers = 0;
	}
	
	//Parameterized constructor
	public Car(String xManuName, int xCylinders, String xOwnersName, 
			double xMileage, int xPassengers)
	{
		super(xManuName, xCylinders, xOwnersName);
		this.setMileage(xMileage);
		this.setPassengers(xPassengers);
	}
	
	//Accessors
	public double getMileage()
	{
		return this.mileage;
	}
	
	public int getPassengers()
	{
		return this.passengers;
	}
	
	//Mutators
	public void setMileage(double xMileage)
	{
		if (xMileage >= 0)
		{
			this.mileage = xMileage;
		}
		
		else 
		{
			System.out.println("Invalid input, resetting to default");	
			this.mileage = 0;
		}
	}
	
	public void setPassengers(int xPassengers)
	{
		if (xPassengers > 0)
		{
			this.passengers = xPassengers;
		}
		
		else
		{
			System.out.println("Invalid input, resetting to default");	
			this.passengers = 0;
		}
	}
	
	//Equals Method
	public boolean equals(Car c)
	{
		return c != null && super.equals(c)
		&& this.mileage == c.getMileage()
		&& this.passengers == c.getPassengers();
	}
	
	//toString Method
	public String toString()
	{
		return super.toString()
		+ "\nGas Mileage: " + this.mileage + " gallons"
	    + "\nNumber of Passengers: " + this.passengers;
	}
}
	
