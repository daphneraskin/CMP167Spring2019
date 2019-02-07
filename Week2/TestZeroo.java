/*
 * Author: Daphne Raskin
 * Created: February 7th, 2019
 * Describe: Average user's three input numbers.
 */

import java.util.Scanner;

public class TestZeroo {

	public static void main(String[] args) {

		double userNum1;
		double userNum2;
		double userNum3;
		double numAverage;
		
		  Scanner scnr = new Scanner(System.in);
		  System.out.print("Enter a number: ");
		  userNum1 = scnr.nextDouble();
		  
		  System.out.print("Enter a second number: ");
		  userNum2 = scnr.nextDouble();
		  
		  System.out.print("Enter a third number: ");
		  userNum3 = scnr.nextDouble();
		  
		  numAverage = (userNum1 + userNum2 + userNum3) / 3;
		  System.out.println("The average of your three numbers is " + numAverage + "!");
	}
}
