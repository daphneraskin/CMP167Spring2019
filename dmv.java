import java.util.Scanner;
public class dmv {
	
	public static void generateDL(int age, boolean testPass) {
		/*Scanner scnr = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = scnr.nextInt();
		System.out.println("Did you pass your test? (yes or no)");
		String pass = scnr.next();
		if (pass.equalsIgnoreCase("yes")) {
			testPass = true;
		}
		else {
			testPass = false;
		}
		*/
		if (age >= 17 && (testPass)) {
			System.out.println("DL Generated.");
		//	System.out.println("Your drivers license will expire in: " + expirationDate(2019));
		}
		else {
			System.out.println("Cannot generate DL");
		}
		
	}
	public static int expirationDate(int yearGenerated) {
		return (yearGenerated + 10);
	}
	public static void main(String[] args) {
		generateDL(18, true);
	}
}
