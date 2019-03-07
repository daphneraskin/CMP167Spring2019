/*author: Daphne Raskin
 *summary: Calculates the average of n natural numbers using for loops
 *Calculates factorial of n
 *date: March 7th, 2019
 */

package strictlyIncreasing;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double n;
		System.out.println("Welcome to Factorial.");
		System.out.println("This program will calculate the factorial of n natural numbers.");
		System.out.println("Enter a natural number: ");
		n = scnr.nextDouble();
		double factorial = 1;
		for (double i = n; i >= 1; i--) {
			factorial = factorial*i;
			
		}
		System.out.println("The factorial of your input is: " + factorial);

		
		
			
	}
}
		
		