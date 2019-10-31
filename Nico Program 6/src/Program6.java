//Project:      Program 6
//Author:       Nicolas Gutierrez
//GitHub:        Nicokicker
//Date:         October 30, 2019

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Start keyboard and declare variables
		
				Scanner keyboard = new Scanner(System.in);
				int menuChoice;
				
				Account accOne = new Account();		
				
				do
				{
					mainMenu();
					menuChoice = keyboard.nextInt();
					
					switch (menuChoice)
					{
						case 1:
							System.out.println("How much would you like to deposit? ");	
							accOne.depositAmount = keyboard.nextDouble();
							accOne.balance = Account.deposit(accOne.depositAmount, accOne.balance);
							break;
						case 2:
							System.out.println("How much would you like to withdrawal? ");	
							accOne.withdrawalAmount = keyboard.nextDouble();
							accOne.balance = Account.withdrawal(accOne.withdrawalAmount, accOne.balance);
							break;
						case 3:
							accOne.displayBalance(accOne.balance);
							break;
						case 4:
							System.out.println("Thank you!  Have a nice day.");	
							break;
						default:
							System.out.println("Please enter a valid choice.");	
					}
					
				}while (menuChoice != 4);
				
				keyboard.close();

			}
			
			
			public static void mainMenu()
			{
				System.out.println("Main Menu");
				System.out.println("=========");
				System.out.println("1.) Make Deposit");
				System.out.println("2.) Withdrawal Funds");
				System.out.println("3.) View Balance");
				System.out.println("4.) Exit");
				System.out.println("What would you like to do? ");
			}
			
		
	}

