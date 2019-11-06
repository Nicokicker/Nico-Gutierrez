//Project:      Program7
//Author:       Nicolas Gutierrez
//GitHub:        Nicokicker
//Date:         November 5, 2019

import java.util.Random;
import java.util.Scanner;

public class program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create Variables
		Scanner keyboard = new Scanner(System.in);
		int[] numbers= new int [10];
		Random rnd = new Random ();
		
		numbers [0] = 3;
		numbers [1] = 4;
		numbers [2] = 2;
		numbers [3] = 5;
		numbers [4] = 4;
		numbers [5] = 10;
		numbers [6] = 4;
		numbers [7] = 30;
		numbers [8] = 23;
		numbers [9] = 17;
		
		for(int i = 0;i<numbers.length; i++)
		{
			System.out.println(" The index of " + i + " is " + numbers[i]);
			System.out.println("");
		
		}

		System.out.println(" Welcome to the 2019 Nicolympics !!!");
		System.out.println("");
		System.out.println(" Description: Long time ago in Rome, brave warriors used to be in charge of the kitchen.");
		System.out.println(" In this game you will have 10 minutes per inning to cook, the team who makes more pancakes wins!!!");
		System.out.println("");
		System.out.println(" Shortly, the user will select the amount of innings, the chefs might get tired... ");
		System.out.println("");
		
		int arraySize = 0;
		System.out.println("How many innings would you like to play ? ");
		arraySize = keyboard.nextInt();
		int[] innings = new int [arraySize];
		int totalteama = 0; 
		int totalteamb = 0; 
		
		for(int i = 0; i <arraySize; i++)
		{
			innings [i] = rnd.nextInt(101);
			System.out.println(" Team A Pancakes made during inning " + i + " are "+ innings[i]);
			totalteama = totalteama + innings [i];
			
			innings [i] = rnd.nextInt(101);
			System.out.println(" Team B Pancakes made during inning " + i + " are "+ innings[i]);
			totalteamb = totalteamb + innings [i];
		}
		
		System.out.println("");
		System.out.println(" Team A total points issued: " + totalteama);
		System.out.println(" Team B total points issued: " + totalteamb);
		System.out.println("");

		if (totalteama < totalteamb) 
  		  System.out.println(" Team B won!!");
  	  else 
  		if (totalteamb < totalteama) 
  		  System.out.println(" Team A won!! ");

		
		
	}

	}
	
