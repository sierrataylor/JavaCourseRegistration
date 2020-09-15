package CourseRegistration_Package;

public class StudentCourseRegisterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Fred", "Smith", "business", 2023);
		Student s2 = new Student("Sam", "Jones", "computer science ", 2021);
		Course c1 = new Course("computer science", 228, 3, 20);
		System.out.println(s1.studentInfo());
		System.out.println(s2.studentInfo());
		System.out.println(c1.courseInfo());
		s1.enroll(c1);
		s2.enroll(c1);
		System.out.println(c1.courseInfo());
		System.out.println(c1.getCourseId());
		Course c2 = new Course("economics", 101, 3, 25);
		System.out.println(c2.courseInfo());
		System.out.println(c2.getCourseId());
		s1.enroll(c2);
		System.out.println(c2.courseInfo());
		System.out.println(s1.studentInfo());
		System.out.println(s2.studentInfo());
	}

}
