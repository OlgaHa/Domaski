package bootcamp.users.people;

public class Student extends Person {
	private int numCourses;
	private String[] courses;
	private int[] grades;
	private static final int MAX_COURSES = 12;
	
	
	
	public Student(String name, String address){
		super(name, address);
		this.numCourses = 0;
		this.courses = new String[MAX_COURSES];
		this.grades = new int[MAX_COURSES];
	}
	public void addCourseGrade(String course, int grade){
		courses[numCourses] = course;
		grades[numCourses] = grade;
		++numCourses;
	}
	
	public void printGrades(){
		for (int i = 0; i < grades.length; i ++) {
			System.out.print(grades[i] + ", ");
		}	
	}
	
	public double getAverageGrade() {
//		this.grades 
		int sum = 0; 
		for (int i = 0; i < grades.length; i ++) {
			sum = sum +  grades[i] ;
		}
		
		return sum/grades.length ;
	}	
	
		
		
	
	public String toString(){
		return "Student: "+ super.toString();
	}
}