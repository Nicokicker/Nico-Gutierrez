import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Finalproject {
		
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
		
			// Open/create output file. 
			FileWriter tempFile = new FileWriter("/Users/nicolasgutierrez/Desktop/totaQuestlScores.txt", true);
			PrintWriter outputFile = new PrintWriter(tempFile);
			
			// Start the keyboard and create 2 random values.
			Scanner keyboard = new Scanner(System.in);
			Random rnd = new Random();
			
		
					
			// Showing the Name of the game, and Instructions. 
			System.out.println("Hello and Welcome to Nico's Magic Quest");
			System.out.println("You need $150 to enter the competiton.");
			
			int menuChoice;
			
			// Displays the menu.
			do 
			{
			displayMenu();
			menuChoice = keyboard.nextInt();
			
			switch(menuChoice)
			{
			case 1:
				System.out.println("You payed the $150 and entered the Magic Quest!");
				break;
			case 2:
				System.out.println("No problem, when ready press 1");
				break;
			default:
				System.out.println("That is an invalid choice. Please press 1 or 2.");
			}
			
			}while(menuChoice !=1);
			
			
			System.out.println("How many Quests would you like to do? Remember you are competing against another team, good Luck! ");
		
					
			// Create array that will be modified by user. 
				int arraySize = keyboard.nextInt();
				int[] scores = new int[arraySize];
				int totalScoreA= 0;
				int totalScoreB = 0;
				outputFile.print("Team 1 \t Team 2");
			
			// Creating randomizer, loop.
			for(int i = 0;i<arraySize;i++)
			{
				scores[i] = rnd.nextInt(100);
				outputFile.print("\n" + scores[i]);
				totalScoreA = totalScoreA + scores[i];
				scores[i] = rnd.nextInt(100);
				outputFile.print("\t" + scores[i]);
				totalScoreB = totalScoreB+ scores[i];	
			}
			
			// Outputs the total score
				outputFile.println("\n=~=~=~=~=~=~");
				outputFile.println(totalScoreA + "\t" + totalScoreB);
				
			// Loop that calculates and outputs the team that won.
				for(int u = totalScoreA; u <=totalScoreA;u++)
				{
					if(totalScoreA>totalScoreB)
					outputFile.println("Team A has won. Congratulations!!");
					else
					outputFile.println("Team B has won."); 
					outputFile.println("HAHA Looser!");
					
					if (totalScoreA==totalScoreB)
						outputFile.println("The game ended as a draw. Both sides win!!");
				}
				
			// Closing the keyboard and the file
				outputFile.close();
				keyboard.close();
				}
			
			//  Menu options.
				public static void displayMenu()
				{
					System.out.println("Menu");
					System.out.println("=========");
					System.out.println("1.) Pay the $150");
					System.out.println("2.) Need time to gather the money!");
					System.out.println("What do you want to do?");
			}

}
