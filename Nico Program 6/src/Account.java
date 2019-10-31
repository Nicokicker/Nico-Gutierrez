//Project:      Program 6 (Class)
//Author:       Nicolas Gutierrez
//GitHub:        Nicokicker
//Date:         October 30, 2019

import java.util.Scanner;

public class Account {

		
		
		double balance = 0.00;
		double depositAmount = 0.00;
		double withdrawalAmount = 0.00;
		
		public Account()
		{
			balance = 0.00;
			withdrawalAmount  = 0.00;
			depositAmount = 0.00;
			
		}			
						
									
					public static double deposit(double amount, double balance)
					{
						return (amount+balance);
					}

					public static double withdrawal(double amount, double balance)
					{
						return (balance-amount);
					}
					
					public static void displayBalance(double balance)
					{

						System.out.println("Your balance is: $" + balance);
				

	}

}
