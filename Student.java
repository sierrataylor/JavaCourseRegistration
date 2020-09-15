package CourseRegistration_Package;

import java.util.ArrayList;

public class Student implements StudentInterface{
	
	private final String studentId;
	private String firstName ;
	private String lastName;
	private String studentMajor;
	ArrayList<Course> classSchedule = new ArrayList<Course>();
	private int graduationYear;
	private int totalCreditHours;
	


	public Student(String firstName, String lastName, String major, int gradYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentMajor = major;
		this.graduationYear = gradYear;
		this.studentId = studentIdGenerator();
	}
	
	private String studentIdGenerator() {
		String id = "B00";
		String numSet = "1234567890";
		for(int i=0; i<5; i++) {
			int rand = (int) (Math.random()*numSet.length());
			id += rand;
		}
		return id;
	}
	
	public void enroll(Course course) {
		classSchedule.add(course);
		if(course.classCount < course.getMaximumClassSize()) {
		course.studentList.add(this);
		course.classCount ++;
		this.totalCreditHours += course.getCreditHours();
		}else {
			System.out.println("There are no more seats available for this course.");
		}
		
		
	}
	@Override
	public String getFullName() {
		// TODO Auto-generated method stub
		return firstName +" "+ lastName;
	}
	
	public ArrayList<Course> getClassSchedule() {
		return classSchedule;
	}

	@Override
	public String getStudentId() {
		return studentId;
	}

	@Override
	public String getStudentMajor() {
		// TODO Auto-generated method stub
		return studentMajor;
	}

	@Override
	public int getTotalCreditHours() {
		// TODO Auto-generated method stub
		return totalCreditHours;
	}
	
	public String studentInfo() {
		return "Student[ Name: "+getFullName()+" Major: "+getStudentMajor()
		+" Total credits: "+getTotalCreditHours()+"]";
	}
}
