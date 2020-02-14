package bootcamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Random {

	public static void main(String[] args) {

		String [] myteams; //a team member array in the given order 
		myteams = setNamestoArray(); 
		System.out.println(Arrays.toString(myteams));
		String [] rand; // upcoming randomized array 
		rand = assighToGroups(myteams);
		Arrays.toString(rand);
		System.out.println("team1: "+ rand[0] + ", " +rand[1]+ ", " +rand[2]);
		System.out.println("team2: "+ rand[3]+ ", "+rand[4]+ ", " +rand[5]);
		System.out.println("team3: "+ rand[6]+ ", "+rand[7]+ ", " +rand[8]);
		System.out.println("team4: "+ rand[9]+ ", "+rand[10]+ ", " +rand[11]);
		System.out.println("team5: "+ rand[12]+ ", "+rand[13]+ ", " +rand[14]);
		System.out.println("team6: "+ rand[15]+ ", "+rand[16] + ", "+rand[17]);
	}
	
	public static String [] setNamestoArray() {//a method to get names from input 
		Scanner sc = new Scanner(System.in);
		String [] teamMembers = new String[18];
		for (int i = 0; i <teamMembers.length; i++) {//asks a name and adds to the teamMembers array 
			System.out.println("Input a name:  ");
			teamMembers[i] = sc.nextLine();
		}
		
		return teamMembers; 
	}
	
	public static String [] assighToGroups(String [] myteams) {//a method to randomize given names
		String [] randomized = new String[18]; 
		
		for (int m=0; m < myteams.length; m++) {//my teams members in the original order 
			for ( int r = 0; r < myteams.length; r = (int) (Math.random()*18)) {//loop to assign randomized numbers (r = one of 17!!)
				if (randomized[r] == null) { //a check if the index int of the filled array is free 
					randomized[r] = myteams [m]; //if free --> assign a new number to the randomized
					break; //rewrites eternally, if not stopped 
				}
			}
			
		}
		
		return randomized; 
	}
}


//		String [][] numberOfTeams = new String [6][3];
//
//		System.out.println("Input a name:  ");
//		inputName = sc.nextLine();
//		
//		
//		for (int i = 0; i < numberOfTeams.length; i++) {
//		 for (int j = 0; j < numberOfTeams [i].length; j++) {
//			i = (int) Math.random() * 6;	
//			j = (int) Math.random() * 3;	
//			 numberOfTeams[i][j] =	inputName;
//			
//			}
//		 
//		}
//		System.out.println(numberOfTeams);
//
//	}
//
//}

//  
//Scanner sc = new Scanner(System.in);
//
//int inputedArrayLength;
//int inputNumber = 0;
//
//System.out.println("Input array length:  ");
//inputedArrayLength = sc.nextInt();
//int[] arr = new int[inputedArrayLength];
//
//for (int i = 0; i < arr.length; i++) {
//	System.out.println("Input value:  ");
//	arr[i] = sc.nextInt();
//
//}
//printoutValues(arr); 
//}
//
//public static void printoutValues(int[] arr) {
//for (int i = 0; i < arr.length; i++) {
//	System.out.print(arr[i] + " ");
//}
//}
//
//}