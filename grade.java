package bean;

public class grade {
	private  String Grade;
	private  String Course_id;
	private String Roll_No;
	
	public grade(){}
	
	public grade(String Grade,String Course_id,String Roll_No)
	{
		this.Grade = Grade;
		this.Course_id = Course_id;
		this.Roll_No = Roll_No;
	}
	
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade=grade;
	}
	public String getCourse_id() {
		return Course_id;
	}
	public void setCourse_id(String course_id) {
		Course_id=course_id;
	}
	public String getRoll_No() {
		return Roll_No;
	}
	public void setRoll_No(String roll_No) {
		Roll_No = roll_No;
	}
}