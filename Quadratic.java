package week12;
/*  
*Quadratic.java
 * author: Daphne Raskin
 * created: 2/14/19
 * description: This program calculates the quadratic equation from user input values.
 */

import java.util.Scanner;
public class Quadratic {
	public static void main (String [] args) {
		Scanner scnr = new Scanner(System.in);
		double a;
		double b;
		double c;
		double root1;
		double root2;
		double discriminant;

		

		System.out.println("Input values for a, b, and c (in the form of ax^2 + bx + c) to find the roots.");
		a = scnr.nextDouble();
		b = scnr.nextDouble();
		c = scnr.nextDouble();
	
		discriminant = Math.pow(b, 2) - 4*a*c;
		root1 = (-b + discriminant)/(2*a);
		root2 = (-b - discriminant)/(2*a);
		System.out.println("The roots to this quadratic are: " + root1 + ", and " + root2);
	}
}
