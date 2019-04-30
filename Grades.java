/* 
 * Name: Daphne Raskin
 * Date: April 18th, 2019
 * Description: Homework Methods due April 29th, 2019
 */

import java.util.Scanner;
import java.util.ArrayList;
public class Grades {
	static Scanner scnr = new Scanner(System.in);
	
	public static int readGrades(int[] grades) {
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
		int finall = arr[arr.length-1];
		return finall;
	}
	public static int maxValue(int[] arr, int firstIndex, int lastIndex) {
		for (int i = firstIndex; i<=lastIndex; i++) {
			if (arr[i] > arr[i+1]) {
				arr[i+1] = arr[i];
			}
		}
		return arr[lastIndex];
	}
	public static int indexOfFirstMaxValue(int[] arr) {
		int indexx = 0;
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]> arr[i+1]) {
				int max = arr[i];
				indexx = i;
				arr[i+1] = arr[i];
			}
		}
		return indexx;
	}
	public static int minValue(int[] arr) {
		int min = 0;
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]< arr[i+1]) {
				min = arr[i];
				arr[i+1] = arr[i];
			}
		}
		return min;
	}
	public static int minValue(int[] arr, int firstIndex, int lastIndex) {
		for (int i = firstIndex; i<=lastIndex; i++) {
			if (arr[i] < arr[i+1]) {
				arr[i+1] = arr[i];
			}
		}
		return arr[lastIndex];
	}

	public static int indexOfFirstMinValue(int[] arr) {
		int indexx = 0;
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]< arr[i+1]) {
				int min = arr[i];
				indexx = i;
				arr[i+1] = arr[i];
			}
		}
		return indexx;
	}

	public static int numberOfBelowAverageElements(int[] arr) {
		int sum = 0;
		int count = 0;
		int numAbove = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			count++;
		}
		double average = sum/count;
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]> average) {
				numAbove++;
			}
		}
		return numAbove;
	}
	public static void rotateElements(int[] arr) {
		int last = arr[arr.length-1];
		for (int i = arr.length-1; i>0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = last;
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
	public static void main(String[] args) {
		int n = 0;
		while(n==-2) {
			int[] arr = new int[100];
			int size = readGrades(arr);
			int MaxGrade = maxValue(arr);
			int MinGrade = minValue(arr);			
	}
}