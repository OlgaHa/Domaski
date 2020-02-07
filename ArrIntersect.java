package bootcamp;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrIntersect {

	public static void main(String[] args) {
		int[] list1 = { 1, 4, 8, 9, 15, 11, 17, 59, 41, 28 };
		int[] list2 = { 4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81 };

		Arrays.parallelSort(list1);
		Arrays.parallelSort(list2);
		System.out.println(Arrays.toString(list1));
		System.out.println(Arrays.toString(list2));
		System.out.print("Intersect: ");
		intersect(list1, list2);

	}

	public static void intersect(int[] arr1, int[] arr2) {
		int match = 0;
		ArrayList arr3 = new ArrayList();
		for (int i = 0; i < arr1.length; i++) {
			Arrays.binarySearch(arr1, i);
			for (int j = 0; j < arr2.length; j++) {
				Arrays.binarySearch(arr2, j);
				if (arr1[i] == arr2[j]) {
					match = arr1[i];
					arr3.add(match);
				}
			}
		}
		System.out.print(arr3);
	}

}
