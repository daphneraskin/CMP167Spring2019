/*author: Daphne Raskin
 *summary: Calculates the average of n natural numbers using for loops
 *date: March 7th, 2019
 */

package strictlyIncreasing;
import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int n;
		System.out.println("Enter a natural number: ");
		n = scnr.nextInt();
		double sum = 0;
		double average;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		average = sum/n;
		System.out.println("The average is: " + average);

		
		
			
	}
}
		
		