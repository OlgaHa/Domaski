
import java.util.Scanner;

public class TestGame {

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
	
	String q3 = "Choose the best definition for a Class: \n"
			+ "A. An action for a program. \n"
			+ "B. An object definition, containing the data and function elements necessary to create an object. \n"
			+ "C. A group of students in a class. \r\n";
			
	String q4 = "Given the declaration: int [ ] arr = {1,2,3,4,5}; What is the value of arr[3]? \n"
			+ "A. 3 \n"
			+ "B. 4 \n"
			+ "C. 5 \r\n";
	
	String q5 = "Choose the best definition of an object. \n"
			+ "A. A thing. \n"
			+ "B. Something you wear. \n"
			+ "C. An instance of a class. \r\n";
	
	String q6 = "What is the proper way to declare a variable? \n"
			+ "A. VariableName; \n"
			+ "B. VariableType variableName; \n"
			+ "C. VariableName variableType; \r\n";
			
	String q7 = "What is a loop?  \n"
			+ "A. A segment of code to be run infinite times. \n"
			+ "B. A segment of code to be run once.  \n"
			+ "C. A segment of code to be run a specified amount of times. \r\n";
	
	String q8 = "If classes Student, Staff and Faculty extend class Person, which one makes sense:  \n"
			+ "A. Person[] persons={new Faculty(), new Staff(), new Student()};  \n"
			+ "B. Faculty[] faculties={new Person(), new Faculty(), new Student()};  \n"
			+ "C. Staff[] staff={new Person(), new Staff(), new Student()};  \n";
			
	String q9 = "Which one needs a web page to run?  \n"
			+ "A. A Java Application  \n"
			+ "B. A Java Stand-Alone Application  \n"
			+ "C. A Java Applet  \n";
			
	String q10 = "What is the main function of any variable ?  \n"
			+ "A. To keep track of data in the memory of the computer  \n"
			+ "B. To print words on the screen  \n"
			+ "C. To add numbers together  \n";
			
			
	
	
	
	////Explanations 
	String exp1 = "The earliest version of Java was known as Oak. This was inspired by a big oak tree that \r\n"
			+ "grew outside the window of the lead creator of Java, "
			+ "James Gosling. It was later changed to Java by Sun’s marketing department when Sun lawyers found that there was already "
			+ "a computer company registered as Oak.";
	
	String exp2 = "Java has 4 platforms: JavaStandard Edition, JavaEnterprise Edition, JavaMicro Edition, and JavaFX.";
	
	String exp3 = "Classes and Objects are basic concepts of Object Oriented Programming which revolve around the real life entities.\n"
			+ "A class is a user defined blueprint or prototype from which objects are created. \n"
			+ "It represents the set of properties or methods that are common to all objects of one type.";
	
	String exp4 = "Because in Java elements start counting from 0. Element [0] is \"1\", so element [3] is \"4\".";
	
	String exp5 = "It is a basic unit of Object Oriented Programming and represents the real life entities. \n"
			+ "A typical Java program creates many objects, which as you know, interact by invoking methods.";
	
	String exp6 = "We can declare variables in java as follows: type: Type of data that can be stored in this variable.\n"
			+ " name: Name given to the variable.";
	
	String exp7 = "Looping in programming languages is a feature which facilitates the execution of a set of instructions/functions repeatedly \n"
			+ " while some condition evaluates to true. Java provides three ways for executing the loops. \n"
			+ "While all the ways provide similar basic functionality, they differ in their syntax and condition checking time. ";
	
	
	Questions [] question = { 
			new Questions (q1, "a", exp1), 
			new Questions (q2, "c", exp2), 
			new Questions (q3, "b", exp3), 
			new Questions (q4, "b", exp4),
			new Questions (q5, "c", exp5),
			new Questions (q6, "b", exp6),
			new Questions (q7, "c", exp7),
			new Questions (q8, "a", null),
			new Questions (q9, "c", null),
			new Questions (q10, "a", null),
	}; 
	
	
		public static void main(String[] args) {
			
			Scanner inputHello = new Scanner(System.in);
			System.out.println("Hi! Do you want to play Java Trivia? (Answer Y/N)");
			String answerYN = inputHello.nextLine();

			if (answerYN.equalsIgnoreCase("Y")) {
				System.out.println("Great! Let's play!");

			} else if (answerYN.equalsIgnoreCase("N")) {
				System.out.println("Have a nice day!");

			} else {
				System.out.println("Please, answe with Y or N.");
			}
			
			TestGame game = new TestGame();
			game.wantsToRepeat();

		}

		public void askQuestion(String question) {
			System.out.println(question);

		}

		public boolean checkAnswer(String userAnswer, String correctAnswer) {
			if (userAnswer.equalsIgnoreCase(correctAnswer)) {
				System.out.println("Great job! You earned 1 point");
				return true;
			} else {
				System.out.println("Sorry, the answer is: " + correctAnswer);
				return false;
			}
		}

		public int countScore(int score) {
			 score++;
			 return score;
		}

		public boolean doesWantToQuit(int score) {
			System.out.println("Do you want to quit game? Y/N");
			Scanner ifwantsQuitInp = new Scanner(System.in);
			String ifwantsQuit = ifwantsQuitInp.nextLine();
			if (ifwantsQuit.equalsIgnoreCase("y")) {
				System.out.println("Thank you! Game is over" + " your score is " + score);
				countScore1(score);
				return true;
			} else {
				return false;
			}
		}

		public boolean doesWantToRepeat() {
			System.out.println("Do you want to repeat game? Y/N");
			Scanner ifwantsRepeatInp = new Scanner(System.in);
			String ifwantsRepeat = ifwantsRepeatInp.nextLine();
			if (ifwantsRepeat.equalsIgnoreCase("y")) {
				return true;
			} else {
				return false;
			}
		}

		public void askNextQuestion(Questions[] question) {
			int score = 0;
			for (int i = 0; i < question.length; i++) {
				askQuestion(question[i].prompt);
				Scanner inputuserInput = new Scanner(System.in);
				String userAnswer = inputuserInput.nextLine();
				if (!userAnswer.equalsIgnoreCase("a") && !userAnswer.equalsIgnoreCase("b") && !userAnswer.equalsIgnoreCase("c") && !userAnswer.equalsIgnoreCase("d") && !userAnswer.equalsIgnoreCase("e")) {
					System.out.println("Please, check your answer");
					i--;
				} 
				else {
					if (checkAnswer(userAnswer, question[i].answer) == true) {
						score = countScore(score);
					}
					if (doesWantToQuit(score) == true) {
						break;
					}

				}
				
			}

		}
	   public void wantsToRepeat() {
		   boolean wantstoRpeat = true;
		  while(wantstoRpeat == true) {
			   askNextQuestion(question);
			  wantstoRpeat = doesWantToRepeat();
		  }
	   }
	   
	   public void countScore1(int score) {
			if (score <= 3) {
				System.out.println("You’re just a Java beginner. Time to hit the books and do a bit more studying.");
			} else if (score > 3 && score <= 5) {
				System.out.println(
						"You’re pretty solid in your Java history, but it might behoove you to pay a little more attention to the details.");
			}
			else if (score > 5 && score <= 7) {
				System.out.println("Nice! You know your stuff!");

			} else if (score > 7) {
				System.out.println("You are a Java master.");
			}
	}
	   
}