/*author: Daphne Raskin
 *summary: Program calculates sum of the first n natural numbers.
 *date: March 4th, 2019
 */

import java.util.Scanner;
public class WeekSixSum {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		int n;
		int sum = 0;
		int counter = 0;
		
		System.out.println("Enter an integer value: ");
		n = scnr.nextInt();
		
		while (counter< n) {
			counter++;
			sum += counter;
		}
		System.out.println("The sum is: " + sum);
	}
}
