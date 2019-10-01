
//Project:      Program 3
//Author:       Nicolas Gutierrez
//GitHub:        Nicokicker
//Date:         Sep 30, 2019

//Import Required Code (import code for keyboard)

import java.util.Scanner;

public class Program3Nico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare variable
				int number;
							
				String name= "Nico";
				
				// Start keyboard scanner 
				Scanner keyboard = new Scanner (System.in);
				
				System.out.println("What is your name? ");
				name = keyboard.next();
				  
				
				 do {
					 System.out.println("Choose a number 0-100 ");
						number= keyboard.nextInt();
						
			      }while( 0>= number || number  >= 100);
				 

				 
				 for( int i = number;i>=0;i--)
				 {	
						if (i<100 && i >0 ) 
						{
							System.out.println(" Countdown " + i + " !! ");
						}
						
					else 
					{
			    System.out.println(" You've reached zero ");
			            }
					 }  
				 {}

	}
	
}