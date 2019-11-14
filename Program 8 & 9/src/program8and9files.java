//Project:      Program 8
//Author:       Nicolas Gutierrez
//GitHub:        Nicokicker
//Date:         November 12, 2019

//Import the package to support files

import java.io.*;
import java.util.Scanner;


public class program8and9files {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub

		 try {
				
				// Open output file (where save)
				FileWriter fw = new FileWriter("/Users/nicolasgutierrez/Desktop/totalGrades.txt", true);
				PrintWriter outputFile = new PrintWriter(fw);


		        // Open input file (where we read)
				File fr = new File ("/Users/nicolasgutierrez/Desktop/grades.txt"); 
				Scanner inputFile = new Scanner (fr);


				double totalGrades = 0.00; 
				double gradeCounter=0.00;

				//loop through input file
				while(inputFile.hasNext()) 
				{
				  double grade = inputFile.nextDouble();
				  totalGrades += grade;
				  gradeCounter++; 


				}
				
				
				// Output data to file
				outputFile.println(" Grade Statistics");
				outputFile.println(" =======================");
				outputFile.println(" Total Points; " +totalGrades);
				outputFile.println(" Total Assignments; " +gradeCounter);
				outputFile.println(" Average Score; " + (totalGrades/ gradeCounter));



				// Close files
				outputFile.close(); 
				inputFile.close(); 


		         }
		          catch (EOFException error)
		 //End Of File exception 
		          {
		             System.out.println(" Sorry. I seem to have reach the end of the file. ");
		             System.out.println(" Error Message:" + error.getMessage());
		           }
		          catch (FileNotFoundException error) 
		         {
		              System.out.println(" Sorry. I cannot seem to find that file. ");
		              System.out.println(" Error Message:" + error.getMessage() ); 
		         }
		    
		    
		} }


