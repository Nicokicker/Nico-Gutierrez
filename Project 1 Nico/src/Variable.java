// Project:      Program 1
// Author:       Nicolas Gutierrez
//GitHub:        Nicokicker
// Date:         Sep 12, 2019

// Import Required Code (import code for keyboard)
import java.util.Scanner;
public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare Variables
		int age; 
		int favoritenumber;
		String name= "Nico";
		
		// Start keyboard scanner 
		Scanner keyboard = new Scanner (System.in);
		
		// Collect input from user
		System.out.println("What is your name? ");
		name = keyboard.next();
		
		System.out.println("What is your age? ");
		age = keyboard.nextInt(); 
		
		System.out.println("What is your favorite number? ");
		favoritenumber = keyboard.nextInt(); 
		
		// Output User Information
		System.out.println("\n" + name + " is " + age + " years old" + ", his favorite number is " + favoritenumber);
	}

}



