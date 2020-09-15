package CourseRegistration_Package;

import java.util.ArrayList;

public interface CourseInterface {
	
	public String getCourseId();

	public int getClassCount();

	public int getMaximumClassSize();

	public int getCreditHours();

	public ArrayList<Student> getStudentList();
}
