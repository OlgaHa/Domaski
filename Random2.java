package bootcamp;

import java.util.Scanner;

public class Random2 {
	

	public static void main(String[] args) {
		while (true) {
		String name; 
		int groupNumber; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Input name:  ");
		name = sc.nextLine();
		groupNumber = (int) (Math.random()*6); 
		System.out.println(name + ", "+ "your group number is: "+ groupNumber);
		
	}
	}
}
