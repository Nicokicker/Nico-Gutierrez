
//Project:      Program 5
//Author:       Nicolas Gutierrez
//GitHub:        Nicokicker
//Date:         October 21, 2019

// Import Required Code (import code for keyboard)

import java.util.Random;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int menuChoice = 0;
        double changeAmount = 0.00;
        double total = 0.00;
        double price = 0.00;
        int tiempo = 0; 
        double TotAPagar = 0;
   		int guests = 0;
        
        System.out.println("Hi, welcome to Nico's Sushi, we hope you enjoy!! ");
        System.out.println(" ");
        System.out.println(" How many people are attending the restaurant ? ");
		  guests=keyboard.nextInt();
		  table(guests);

		  
        do
        {
            mainMenu();
            menuChoice = keyboard.nextInt();
            switch (menuChoice)
            {
                case 1:
                	 System.out.println("Tuna cake price ");
                     price = keyboard.nextDouble();
                    System.out.println("Tuna Cake is $5, how much are you going to pay? ");
                    total = keyboard.nextDouble();
                    changeAmount =  change (total, price);
                    System.out.println("You're change is : $" + changeAmount);
                    tiempo = time ();
                    System.out.println(" You're Tuna Cake is going to take " + tiempo + " minutes, please wait");
                    System.out.println("=========");
                    System.out.println(" Would you like to add any other delicious meal? If done press 4 !!");
                    System.out.println("");
                    break;
                case 2:
                	System.out.println("Dragon Roll price ");
                    price = keyboard.nextDouble();
                    System.out.println("Dragon Roll is $12, how much are you going to pay? ");
                    total = keyboard.nextDouble();
                    changeAmount = change (total, price);
                    System.out.println(" your change is: $" + changeAmount); 
                    tiempo = time ();
                    System.out.println(" You're Dragon Roll is going to take " + tiempo + " minutes, please wait");
                    System.out.println("=========");
                    System.out.println(" Would you like to add any other delicious meal? If done press 4 !!");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Toro Nigiri price ");
                    price = keyboard.nextDouble();
                    System.out.println(" Toro Nigiri is $10, how much are you going to pay ?  ");
                    total = keyboard.nextDouble();
                    changeAmount = change (total, price);
                    System.out.println(" your change is: $" + changeAmount);
                    tiempo = time ();
                    System.out.println(" You're Toro Nigiri is going to take " + tiempo + " minutes, please wait");
                    System.out.println("=========");
                    System.out.println(" Would you like to add any other delicious meal? If done press 4 !!");
                    System.out.println("");
                    break;
                case 4: 
                    System.out.println(" You're total check is " + price + " How much are you paying? ");
                    TotAPagar=keyboard.nextDouble();
                    changeAmount = change (TotAPagar, price);
                    System.out.println("You're change is : $" + changeAmount);
                    System.out.println(" If done, please press option 5!! ");
                    System.out.println("=========");
                    break;
                case 5:
                    System.out.println("Thank you! Hope to see you back again. ");
                    break;
                default:
                    System.out.println("Please enter a valid choice.");
            }
        }while (menuChoice != 5);
        // Close keyboard
        keyboard.close(); 
    }
    
    
                       // Method to display a menu
                       public static void mainMenu()
                       {
                            
                               System.out.println("Main Menu");
                               System.out.println("=========");
                               System.out.println("1.) Tuna Cake ($5) ");
                               System.out.println("2.) Dragon Roll ($12) ");
                               System.out.println("3.) Toro Nigiri ($10 )");
                               System.out.println("4.) If you're done, press here to recieve check ");
                               System.out.println("5.) Exit");
                               System.out.println("What would you like to order ? ");
                       }

                       // Method to perform a change (receives and returns information)
                       public static double change(double amount, double price)
                       {
                               double check = -1;
                               if (amount>= price)
                                       check=  amount - price;
                               return check ;
                       }

                       // Method to perform a time (returns information)
                       public static int time ()
                       {

                   		Random randomNumber = new Random();
                   		
                   		int time = randomNumber.nextInt(15) + 1;
                               return  time;
                       }
                    // Method to perform a table (receives information)
                       public static void table (int l )
                       {
                    	  if (l<3) 
                    		  System.out.println("You've been assigned a small table");
                    	  else 
                    		  if (l>3 && l<6) 
                        		  System.out.println("You've been assigned a mediuem table");
                    		  else
                    			  if (l>6)
                            		  System.out.println("You've been assigned a big table");
                    			  
                    	  
                    	   
                       }

       }


   

