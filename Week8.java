/*Author: Daphne Raskin
*Summary: Practice creating static methods
*Date: March 19th, 2019
*/

import java.util.Scanner;
public class Week8 {
	static Scanner scnr = new Scanner(System.in);


public static void Greeting () {
	System.out.print("Hello, user!");
}

public static void methodTwo() {
	Greeting();
	System.out.println(" Please enter your last name here! ");
	String userInput = scnr.next();
	if ((( userInput.charAt(userInput.length()-1)) == 'a') || (( userInput.charAt(userInput.length()-1)) == 'e')) {
		System.out.println("Miss " + userInput + ". ");
	} 
	else {
		System.out.println("Mister " + userInput + ". ");
	}
}
public static void methodThree (int numPeople) {
	for (int i = 0; i<= numPeople; i++) {
		methodTwo();
	}
}
public static void main(String[] args) {
	System.out.println("Hello there. Enter the number of people in your room right now.");
	int numPeople = scnr.nextInt();
	methodThree(numPeople);
}
}
