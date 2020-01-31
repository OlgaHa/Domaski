package bootcamp.users.people;

import java.util.Arrays;

public class Teacher extends Person {
	private int numCourses;
	private String[] courses;
	private static final int MAX_COURSES = 4;

	public Teacher(String name, String address) {
		super(name, address);
		this.numCourses = 0;
		this.setCourses(new String[MAX_COURSES]);
	}

	public void addCourse(String course) {
		getCourses()[numCourses] = course;
		++numCourses;
		// System.out.println(Arrays.toString(this.courses));
	}

	public boolean addCourses(String course) {
		// переменная в которой мы храним индекс найденного элемента
		int foundIndex = -1;// изначально присваиваем отрицательное число, потому что индекса в массиве не
							// может быть отрицательным
		// цикл, чтобы найти в массиве курсов (courses) элемент (course)
		for (int i = 0; i < courses.length; i++) {
			if (course.equals(courses[i])) {// каждый элемент сравниваю с искомым (course)
				foundIndex = i; // присваиваем индекс найденого элемента к foundIndex;
				break; // если курс найден, то поиск заканчивается
			}
		}
		if (foundIndex >= 0) {
			return true;
		} else {
			this.addCourse(course);
			return false;
		}
	}

	public boolean removeCourses(String course) {
		int foundIndex = -1;
		for (int i = 0; i < courses.length; i++) {
			if (course.equals(courses[i])) {
				foundIndex = i;
				break;
			}
		}
		if (foundIndex >= 0) {
			courses[foundIndex] = "delete";//присваиваем в элемент с найденным индексом слово delete 

			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return "Teacher: " + super.toString();
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}
}
