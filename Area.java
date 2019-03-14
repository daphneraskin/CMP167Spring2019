import java.util.Scanner;
	public class Area {
		static Scanner scnr = new Scanner(System.in);
		/*
		 * Area.java
		 * Name: Daphne Raskin
		 * Date: March 14th, 2019
		 * Summary: This program implements area functions/method/return statements\
		 * Area of a rectangle, area of a circle, area of a triangle
		 */
	public static int rectArea(int width, int length) {
		return width*length;
	 } 
		/*
		* Area : void
		* inputs: width and length
		* process: area = width * length
		* output: area
		*/
		
		/*
		 * circArea: = void
		 * inputs: = radius
		 * process: pi * radius^radius
		 * output: circArea
		 */
	 public static double circArea(double radius) {
		return Math.PI*Math.pow(radius, 2);
	 }
	 /*
	 * triArea = void
	 * inputs = base and height
	 * process (base * height) / 2
	 * output: triArea
	 */
	 public static double triArea(double width, double length) {
		return width*length*1 / 2; //process calculate triangle area
	 }

	 public static void main (String[] args) {
		 //rectArea(); //Function call/invocation
		 //circArea();
		 System.out.println("Enter width and length: ");
		 int width = scnr.nextInt();
		 int length = scnr.nextInt();
		 int recarea = rectArea(width, length);
		 double triarea = triArea(width, length);
		 double circArea = circArea(width);
		 System.out.println("Rectangle Area: " + recarea);
		 System.out.println("Triangle Area: " + triarea);
		 System.out.println("Circle Area: " + circArea);
	 }
}