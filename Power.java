/* author: Daphne Raskin
 * summary: This program prints out the first nth power of two using for loop
 * date: March 7th, 2019
 */
package strictlyIncreasing;
import java.util.Scanner;
public class Power {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to Power");
		System.out.println("This program calculates the first nth powers");
		System.out.println("Please enter a value of n: ");
		int n = scnr.nextInt();
		System.out.println("_______________________________");
		int power = 1;
		System.out.println(power);
		for (int i = 2; i <= n; i++) {
			power = power*2;
			System.out.println(power);
		}
			
	}
}
