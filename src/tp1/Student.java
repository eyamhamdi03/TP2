package tp1;


import java.util.ArrayList;

public class Student {
	protected int studentID;
	protected String firstName ;
	protected String lastName ;
	protected ArrayList<Course> courses = new ArrayList<>();
	public int getStudentId() {
		return(studentID);
	}
	public String getFirstName()
	{
		return(firstName);
	}
	public String getLastName() {
		return(lastName);
	}
	public ArrayList<Course> geetCourse(){
		return(courses);
	}
	public void enroll (Course course)
	{
		courses.add(course);
	}
	
	
}
