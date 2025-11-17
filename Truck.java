//Julliana Dela Cruz 
public class Truck extends Vehicle {
	
	private double loadCap;
	private double towCap;
	
	//Default Constructor
	public Truck()
	{
		super();
		this.loadCap = 0;
		this.towCap = 0;
	}
	
	//Parameterized Constrcutor
	public Truck(String xManuName, int xCylinders, String xOwnersName, double xLoadCap, double xTowCap)
	{
		super(xManuName, xCylinders, xOwnersName);
		this.setLoadCap(xLoadCap);
		this.setTowCap(xTowCap);
	}
	
	//Accessors
	public double getLoadCap()
	{
		return this.loadCap;
	}
	
	public double getTowCap()
	{
		return this.towCap;
	}
	
	//Mutators
	public void setLoadCap(double xLoadCap)
	{
		if (xLoadCap >= 0)
		{
			this.loadCap = xLoadCap;
		}
		
		else
		{
			System.out.println("Invalid input, resetting to default");	
			this.loadCap = 0;
		}
	}
	
	public void setTowCap(double xTowCap)
	{
		if (xTowCap >= 0)
		{
			this.towCap = xTowCap;
		}
		
		else
		{
			System.out.println("Invalid input, resetting to default");	
			this.towCap = 0;
		}
	}
	
	//Equals Method
	public boolean equals(Truck t)
	{
		return t != null && super.equals(t)
		&& this.loadCap == t.getLoadCap()
		&& this.towCap == t.getTowCap();
	}
	
	//toString Method
	public String toString()
	{
		return super.toString()
		+"\nLoad Capacity: " + this.loadCap 
		+"\nTowing Capacity: " + this.towCap ;
	}
}
