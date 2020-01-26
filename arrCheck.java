package bootcamp;

import java.util.Arrays;

public class arrCheck {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 4, 5 };

		int checkNum = 10;

		boolean bilLicheckNum = false;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == checkNum) {
				bilLicheckNum = true;
			}
		
		}
		if (bilLicheckNum == true) {
			System.out.println(8);
		} else {
			System.out.println("Not found");
		}
	}
}
