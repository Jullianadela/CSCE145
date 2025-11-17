//Julliana Dela Cruz
public class Vehicle {

	//Instance Variables
	private String manuName;
	private int cylinders;
	private String ownersName;
	
	//Default Constructor
	public Vehicle()
	{
		this.manuName = "Unknown";
		this.cylinders = 1;
		this.ownersName = "No name yet";
	}
	
	//Parameterized Constructor
	public Vehicle(String xManuName, int xCylinders, String xOwnersName)
	{
		this.setManuName(xManuName);
		this.setCylinders(xCylinders);
		this.setOwnersName(xOwnersName);
	}
	
	//Accessors
	public String getManuName()
	{
		return this.manuName;
	}
	
	public int getCylinders()
	{
		return this.cylinders;
	}
	
	public String getOwnersName()
	{
		return this.ownersName;
	}
	
	//Mutators
	public void setManuName(String xManuName)
	{
		if(xManuName.equalsIgnoreCase("Nissan")
			||xManuName.equalsIgnoreCase("Chevy")
			||xManuName.equalsIgnoreCase("Ford")
			||xManuName.equalsIgnoreCase("Toyota")
			||xManuName.equalsIgnoreCase("Volkswagen")
			||xManuName.equalsIgnoreCase("Dodge"))
		{
			this.manuName = xManuName;
		}
		else
		{
			System.out.println("Invalid manufacturer name, setting to default.");
			this.manuName = "Unknown";
		}
	}
	
	public void setCylinders(int xCylinders)
	{
		if (xCylinders > 0)
		{
			this.cylinders = xCylinders;
		}
		else
		{
			System.out.println("Error");
		}
	}
	
	public void setOwnersName(String xOwnersName)
	{
		if(xOwnersName.equalsIgnoreCase("John")
				||xOwnersName.equalsIgnoreCase("Bob")
				||xOwnersName.equalsIgnoreCase("Eddie")
				||xOwnersName.equalsIgnoreCase("Mark")
				||xOwnersName.equalsIgnoreCase("Julliana"))
			{
				this.ownersName = xOwnersName;
			}
			else
			{
				System.out.println("Invalid owner name, setting to default.");
				this.ownersName = "No name yet";
			}
	}
	
	//Equals Method
	public boolean equals(Vehicle v)
	{
		return v != null
				&& this.manuName.equalsIgnoreCase(v.getManuName())
				&& this.cylinders == v.getCylinders()
				&& this.ownersName.equalsIgnoreCase(v.getOwnersName());
	}
	
	//To String Method
	public String toString()
	{
		return "Manufacturer's name: " + this.manuName  
				+"\nNumber of Cylinders: " + this.cylinders  
				+"\nOwner's Name: " + this.ownersName;
	}
	}
