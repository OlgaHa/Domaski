package bootcamp.game;

import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {
	
		String q1 = "What was Java originally called?\r\n" + 
				"a.) Oak\r\n" + 
				"b.) Spruce\r\n" + 
				"c.) Latte\r\n" + 
				"d.) Chai\r\n"; 
		String q2 = "How many platforms does Java have?\r\n" + 
				"a.) One\r\n" + 
				"b.) Three\r\n" + 
				"c.) Four\r\n" + 
				"d.) Seven\r\n";
		
		String exp1 = "The earliest version of Java was known as Oak. This was inspired by a big oak tree that \r\n"
				+ "grew outside the window of the lead creator of Java, "
				+ "James Gosling. It was later changed to Java by Sun’s marketing department when Sun lawyers found that there was already "
				+ "a computer company registered as Oak.";
		
		String exp2 = "Java has 4 platforms: JavaStandard Edition, JavaEnterprise Edition, JavaMicro Edition, and JavaFX.";
		
		
		Questions [] question = { 
				new Questions (q1, "a", exp1), 
				new Questions (q2, "c", exp2), 
		}; 
		
		
		//Game test
		boolean wantsToPlay;
		while ( wantsToPlay = true){
			playGame(question);	
			wantsToPlay = ifWantsToRepeat();
		}
	}
	
	//My Methods 
	public static void playGame(Questions [] question) {
		int score = 0;
		Scanner userInput = new Scanner(System.in);
			for (int i =0; i<question.length; i++) {
			System.out.println(question[i].prompt);
			String answer = userInput.nextLine();
			if (isInputValid(answer)) {
		    	 playGame(question);
			}
			
			if (answer.equalsIgnoreCase(question[i].answer)) {
				score++;
				System.out.println("Great job! You earned 1 point");
				System.out.println(question[i].explanation+ " \r\n");
				toQuitGame();
			}
			
			else {
				System.out.println("Sorry, the answer is: " + question[i].answer + ".  "+ question[i].explanation + " \r\n");
				toQuitGame();
			}
			
		}
			System.out.println("Your score is:  "+ score);
	}
	
	public static void toQuitGame() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to continue? Y/N");
		String userDecision = sc.nextLine();
		if(userDecision.equalsIgnoreCase("n")) {
		System.out.println("Thank you! Have a nice day!");
		}
		
	}
	
	public static boolean isInputValid(String inp) {
     if (!inp.equalsIgnoreCase("a") && !inp.equalsIgnoreCase("b") && !inp.equalsIgnoreCase("c") && !inp.equalsIgnoreCase("d") && !inp.equalsIgnoreCase("e")) {
    	 System.out.println("Sorry, a wrong input. Please, try again");
    	 return true; 
     }
     else return false; 
	}
	
	public static boolean ifWantsToRepeat() { 
		System.out.println("Do you want to try again? Y/N");
		Scanner sc = new Scanner(System.in);
		String userinp2 = sc.nextLine();
		if(userinp2.equalsIgnoreCase("y")) {
			return true; 
		}
		else {
			System.out.println("Thank you! Have a nice day!");
			return false; 
		}
	}
}
