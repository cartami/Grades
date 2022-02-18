package Week2_HW3;

public class Student extends Person {
	int ID;
	String fname;
	String lname;
	String email;
	
	
	
	public Student(int iD, String fname, String lname, String email) {
		super();
		ID = iD;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [getID()=" + getID() + ", getFname()=" + getFname() + ", getLname()=" + getLname()
				+ ", getEmail()=" + getEmail() + ", getPname()=" + getPname() + ", getPage()=" + getPage()
				+ ", getPgender()=" + getPgender() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	

	
}
