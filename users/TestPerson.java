package bootcamp.users;

import java.util.Arrays;

import bootcamp.users.people.Student;
import bootcamp.users.people.Teacher;

public class TestPerson {

		
		public static void main(String[] args) {
			
			String[] strArr = new String[12];
			strArr[0] = "Sport";
			strArr[1] = "Math";
			System.out.println(strArr[0]+", "+strArr[1]);
			
			Teacher teacher1 = new Teacher("Toms","Riga");
			System.out.println(teacher1.toString());
			teacher1.addCourse("Sport");
			teacher1.addCourse("Math");
			teacher1.addCourse("History");
			
			System.out.println(Arrays.toString(teacher1.getCourses())); //вывод всех курсов
			
			System.out.println(teacher1.addCourses("Astronomy"));//проверка, есть ли Astronomy  с помощью метода addCourses и вывод true или false  
			System.out.println(Arrays.toString(teacher1.getCourses())); //вывод всех курсов, должно добавиться Astronomy
			
			System.out.println(teacher1.removeCourses("Math"));//проверка, есть ли Math  с помощью метода removeCourses и вывод true или false  
			System.out.println(Arrays.toString(teacher1.getCourses())); //вывод всех курсов, должно удалиться  "Math" и замениться на deleted 
			
			//For-each loops
//			for(String course : courses){
//				teacher1.addCourse(course);
//			}
//			
			
			
			Student student1 = new Student("Leo", "London"); 
			student1.addCourseGrade("Math", 8);
			student1.addCourseGrade("Biology", 6);
			student1.addCourseGrade("History", 7);
			student1.addCourseGrade("Music", 9);
			student1.addCourseGrade("Sport", 5);
			student1.printGrades();
			System.out.println(); //пробел 
			System.out.println(student1.getAverageGrade());
			
		}

	}




