/* 
 * Name: Daphne Raskin
 * Date: April 18th, 2019
 * Description: Homework Methods due April 29th, 2019
 */

import java.util.Scanner;
public class Grades {
	static Scanner scnr = new Scanner(System.in);
	public static int readGrades(int[] grades) {
		//Yanilda did this one. It is correct.
		int position = 0;
		while (position< grades.length) {
			System.out.println();
			System.out.println("Enter a grade: ");
			int grade = scnr.nextInt();
			if (grade>=0){
				grades[position] = grade;
				position++;
			}
			else 
				break;
		
		}
		return position;
	}
	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = arr.length; i>= 1; --i) {
			sum = sum + arr[i];
		}
		return sum;
	}
	public static int sum(int[] arr, int firstIndex, int lastIndex) {
		int sum = 0;
		for (int i = firstIndex; i<= lastIndex; i++) {
			sum = sum + arr[i];
		}
		if (firstIndex != 0 || lastIndex >= arr.length) {
			sum = -666;
		}
		return sum;
	}
	public static double average(int[] arr) {
		int sum = 0;
		for (int i = 0; i< arr.length; i++) {
			sum = sum + arr[i];
		}
		double avg = sum / arr.length;
		return avg;
	}
	public static int maxValue(int[] arr) {
		for (int i = 0; i< arr.length; i++) {
			if (arr[i] > arr[i+1]) {
				arr[i + 1] = arr[i];
			}
		}
		int final = arr[arr.length-1];
		return final;
	}
	public static int maxValue(int[] arr, int firstIndex, int lastIndex) {
		
	}
	public static int indexOfFirstMaxValue(int[] arr) {
		
	}
	public static int minValue(int[] arr) {
		
	}
	public static int minValue(int[] arr, int firstIndex, int lastIndex) {
				
     }
	public static int indexOfFirstMinValue(int[] arr) {
		
	}
	public static int numberOfBelowAverageElements(int[] arr) {
		
	}
	public static void rotateElements(int[] arr) {
		//Yanilda did this one. It is correct.

		for (int i = 0; i<arr.length; i++) {
			

			}
		}
	}
	public static void rotateElements(int[] arr, int rotationCount) {
		for (int i = 0; i<arr.length; i++) {
			arr[rotationCount] = arr[i];
		}
	}
	public static void reverseArray(int[] arr) {
		for (int i = 0; i<arr.length; i++) {
			arr[i] = arr[arr.length-i];
		}
	}
	public static void main(java.lang.String[] args) {
		
	}
}
