package bootcamp;

import java.util.Scanner;

import java.util.Arrays;

public class ScannerAndArrays {

	// HW: User inputs array length
	// user adds element value
	// array values are printed to console
	// create methods for printing out arrays values
	// for loop

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inputedArrayLength;
		int inputNumber = 0;

		System.out.println("Input array length:  ");
		inputedArrayLength = sc.nextInt();
		int[] arr = new int[inputedArrayLength];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Input value:  ");
			arr[i] = sc.nextInt();
		
		}
		printoutValues(arr); 
	}

	public static void printoutValues(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
