#Java Project: Week Four
#Author: Daphne Raskin
#Date: 2/21/19
#Description: Classifying Inputted Ages

package strictlyIncreasing;

import java.util.Scanner;

public class WeekFour {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int userAge;
		
		System.out.println("Enter your age. Round to the nearest year.");
		userAge = scnr.nextInt();
		
		if (19 > userAge)
			System.out.print("Teenager");
		else if (userAge <= 25)
			System.out.print("Young Adult");
		else 
			System.out.print("Adult");
				
	}

}
