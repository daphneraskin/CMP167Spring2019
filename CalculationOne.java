/*
 * Author: Daphne Raskin
 * Date: April 9th, 2019
 * Description: Using Arrays
 */
public class CalculationOne {
	public static int sumList(int[] list) {
		int sum = 0;
		for (int i=0; i<list.length; i++) {
			sum = sum + list[i];
		}
		return sum;
	}
	public static int averageList(int[]list) {
		int avg=0;
		avg = sumList(list)/list.length;
		return avg;
	}
	public static int oddElements(int[]list) {
		int number = 0;
		for (int i = 0; i<list.length; i++) {
			if (list[i] % 2 != 0) {
				number += 1;
			}
		}
		return number;
	}
	public static void main(String[]args) {
		int[] iArray1 = {54, 45, 78, 57, 63};
		int[] iArray2 = {5, 52, 8, 57, 64, 48, 23};
		
		
		System.out.printf("The sum of all elements is %d and the average is %d. The number of odd numbers in this array is %d.", sumList(iArray1), averageList(iArray1), oddElements(iArray1));
	
	}

}
