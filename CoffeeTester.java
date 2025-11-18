//Julliana Dela Cruz

import java.util.Scanner;
public class CoffeeTester {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		//Welcoming User
		System.out.println("Welcome to Coffee Hour!");
		
		//First Coffee
		System.out.println("What's the name of the first coffee?");
		
		String name1 = key.nextLine();
		
		  if (name1.length() == 0 || name1.equals(" ")) 
		  {
	            System.out.println("Invalid name, setting to default!");
	            
	            name1 = "none";
	      }
		
		System.out.println("What's the caffeine content?");
		
		Double caffeine1 = key.nextDouble();
		
		key.nextLine();
		
		Coffee c1 = new Coffee();
		
		c1.setName(name1);
		
		c1.setCaffeine(caffeine1);
		
		//Second Coffee
		System.out.println("What's the name of the second coffee?");
		
		String name2 = key.nextLine();
		
		if (name2.length() == 0 || name2.equals(" ")) 
		  {
	            System.out.println("Invalid name, setting to default!");
	            
	            name2 = "none";
	      }
		
		System.out.println("What's the caffeine content?");
		
		Double caffeine2 = key.nextDouble();
		
		key.nextLine();
		
		Coffee c2 = new Coffee();
		
		c2.setName(name2);
		
		c2.setCaffeine(caffeine2);
		
		//Warning user about caffeine risk (output)
		c1.writeOutput();
		
		System.out.println(); //Making sure output does not print right after one another
		
		c2.writeOutput();
		
		
	

	}

}
