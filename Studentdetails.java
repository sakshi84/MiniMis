package bean;

public class  Studentdetails{
       
	  private  String Name;
	  private  String Roll_No;
	  private  String Email;
	  private  String Date_Of_Birth;
	  private  String Contact;
	  private  String Date_of_Admission;
	  private  String Branch;
	  private  String Degree;
	  private  String Admission_Batch;
	  
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getRoll_No() {
		return Roll_No;
	}
	public void setRoll_No(String roll_No) {
		Roll_No = roll_No;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDate_Of_Birth() {
		return Date_Of_Birth;
	}
	public void setDate_Of_Birth(String date_Of_Birth) {
		Date_Of_Birth = date_Of_Birth;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	public String getDate_of_Admission() {
		return Date_of_Admission;
	}
	public void setDate_of_Admission(String date_of_Admission) {
		Date_of_Admission = date_of_Admission;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getDegree() {
		return Degree;
	}
	public void setDegree(String degree) {
		Degree = degree;
	}
	public String getAdmission_Batch() {
		return Admission_Batch;
	}
	public void setAdmission_Batch(String admission_Batch) {
		Admission_Batch = admission_Batch;
	}
	
	/*public static void main(String args[]){
		Student_details c=new Student_details();
		StudentDao.Fetch_from_database(c); 
		System.out.println(c.getName());
		System.out.println(c.getBranch());
	}*/
}