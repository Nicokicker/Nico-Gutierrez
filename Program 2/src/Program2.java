// Project:      Program 2
// Author:       Nicolas Gutierrez
//GitHub:        Nicokicker
// Date:         Sep 23, 2019

// Import Required Code (import code for keyboard)

import java.util.Scanner;

public class Program2 {


	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare Variables
				int firstnumber; 
				int secondnumber;
				int thirdnumber;
				
				String name= "Nico";
		
		// Start keyboard scanner 
				Scanner keyboard = new Scanner (System.in);
	
				System.out.println("What is your name? ");
				name = keyboard.next();
				
				System.out.println("What is your first number ? ");
				firstnumber = keyboard.nextInt(); 
				
				System.out.println("What is your second number ? ");
				secondnumber = keyboard.nextInt(); 
				
				System.out.println("What is your third number ? ");
				thirdnumber = keyboard.nextInt(); 
	
				
				// Output User Information
				System.out.println("\n" + name + "'s numbers are " + firstnumber + ", " + secondnumber + " and " + thirdnumber);
			
				
				//Display menu and get user input 
				System.out.println("Main Menu ");
				System.out.println("==========\n");
				System.out.println("1.) Add");
				System.out.println("2.) Substract");
				System.out.println("3.) Multiply");
				System.out.println("4.) Divide");
				System.out.println("5.) Exit");
				System.out.println("Please make a choice (1-5): ");
				
				
				int choice; 
				choice = keyboard.nextInt();
				  
				int operation = 0;
				
  
				switch (choice)
				{
				case 1: 
					operation= firstnumber + secondnumber;
				     System.out.println("Sum of the integers = " + operation);				   
				     break;
				       
				case 2: 
					operation= firstnumber - secondnumber;
				     System.out.println("Substraction of the integers = " + operation);				   
				     break;
				case 3: 
					operation = firstnumber * secondnumber;
				     System.out.println("Multiplication of the integers = " + operation);	
				    break;
				    
				case 4: 
					operation = firstnumber / secondnumber;
				     System.out.println("Divition of the integers = " + operation);
				    break;
				    
				case 5: 
					System.out.println("Thanks!");
				    break;
				    
				default:
					System.out.println(" You made an invalid choice");
				
						}
				
				if(operation > thirdnumber)
				    System.out.println(  operation + " is greater than " + thirdnumber);
				
				else
					if (operation < thirdnumber)
						System.out.println(  operation + " is less than " + thirdnumber);
					else 
						System.out.println(  operation + " is equal to " + thirdnumber);
	}

}
