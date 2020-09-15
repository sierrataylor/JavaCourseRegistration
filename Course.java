package CourseRegistration_Package;

import java.util.ArrayList;
import java.util.Random;

public class Course implements CourseInterface{

	private final String subject;
	private int courseNumber;
	private String courseId;
	private final int creditHours;
	private final int maximumClassSize;
	public int classCount=0;

	public ArrayList<Student>studentList = new ArrayList<Student>();

	public Course(String subject, int courseNum, int creditHrs, int maxSize) {
		this.subject = subject;
		this.courseNumber = courseNum;
		this.courseId = setCourseId(subject)+""+courseNumber;
		this.creditHours = creditHrs;
		this.maximumClassSize = maxSize;
	}

	public String setCourseId(String str) {
		String departmentCode="";
		switch(str) {
		case "computer science":
			departmentCode= "cs";
			break;
		case "history":
			departmentCode= "hs";
			break;
		case "english":
			departmentCode= "en";
			break;
		case "math":
			departmentCode= "mt";
			break;
		case "philsophy":
			departmentCode= "ph";
			break;
		case "spanish":
			departmentCode= "sp";
			break;
		case "political science":
			departmentCode= "po";
			break;
		case "art history":
			departmentCode= "ah";
			break;
		case "data science":
			departmentCode= "data";
			break;
		case "economics":
			departmentCode= "ec";
			break;
		default:
			System.out.println("INVALID DEPARTMENT CODE");

		}
		return departmentCode;
	}

	@Override
	public String getCourseId() {
		// TODO Auto-generated method stub
		return courseId;
	}

	@Override
	public ArrayList<Student> getStudentList() {
		// TODO Auto-generated method stub
		return studentList;
	}

	@Override
	public int getClassCount() {
		// TODO Auto-generated method stub
		return classCount;
	}

	@Override
	public int getMaximumClassSize() {
		// TODO Auto-generated method stub
		return maximumClassSize;
	}

	@Override
	public int getCreditHours() {
		// TODO Auto-generated method stub
		return creditHours;
	}

	public String courseInfo() {
		return "Course [subject=" + subject + ", courseId=" + courseId + ", creditHours=" + creditHours
				+ ", maximumClassSize=" + maximumClassSize + ", classCount=" + classCount +"]";
	}

}
