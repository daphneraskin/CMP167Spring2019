import java.util.Scanner;

/*
 * Area.java
 * Yanilda
 * This program implements area functions/method
 */
public class AreaOne {
	                        //  Scanner object
	static Scanner keyboard = new Scanner(System.in);
	/*
	 * rectArea : void
	 * inputs: width and length
	 * process: area= width*length
	 * output: area
	 */
	public static void rectArea() {
		int width, length, area;
		System.out.println("Let's calculate rectangle area");
		//input
		System.out.println("Enter width:");
		width = keyboard.nextInt();
		System.out.println("Enter length:");
		length = keyboard.nextInt();
		//process/calculation
		area = width * length;
		//output
		System.out.println("The rect area is: "+area);
	}
	//Circle area
	/*
	 * circArea
	 * inputs: radius
	 * process: area= pi*r*r
	 * output: area
	 */
	public static void circArea() {
		double radius, area;
		System.out.println("Area of the Circle");
		
		System.out.println("Enter radius");
		radius = keyboard.nextDouble();
		
		area = Math.PI * radius * radius;
		
		System.out.println("The circle area is: "+area);
		
	}
	//TriArea Write code below
	
	//for debugging
	public static void main(String[] args) {
		rectArea();//Function call/invocation
		circArea();
	}
}