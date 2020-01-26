package bootcamp;

import java.util.Scanner;

public class WhileCheck {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input value:  ");

		int inputValue;

		while (input.hasNext()) {
			if (input.hasNextInt()) {
				inputValue = input.nextInt();
				System.out.println("Your input is  " + inputValue);
			}

			else {
				System.out.println("Your input is not int");
				input.next();
			}

		}
	}
}

//			 
//			 }

//			
//			 if(input.hasNextInt()) {
//				 inputValue = input.nextInt(); 
//				 System.out.println("Your input is  "+ inputValue);
//			 }
//			 else {
//				 System.out.println("Your input is not int");
//			 }
//			}
//}
