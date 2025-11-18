//Julliana Dela Cruz
import java.util.Scanner;

public class AppleTester {
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Welcome to the Apple tester!!!" 
		+ "\nCreating the first apple! \nDefault values of the "
		+ "first apple object:");
		
		Apple p1 = new Apple();
		p1.writeOutput();
		
		System.out.println("Enter the type of the second apple object:");
		String type = key.nextLine();
		
		System.out.println("Enter the weight of the second apple object:");
		double weight = key.nextDouble();
		
		System.out.println("Enter the price of the second apple object:");
		double price = key.nextDouble();
		
		
		System.out.println("Creating the second apple object!");
		Apple p2 = new Apple(type, weight, price);
		
		System.out.println("Values of the second object:"); 
		p2.writeOutput();
		

	}

}
