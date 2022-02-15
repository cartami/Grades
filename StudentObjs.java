
public class StudentObjs {

	public static void main(String[] args) {
		Student students[] = new Student[5];

		students[0] = new Student(45);
		students[0].fname = "Barry";
		students[0].fname = "Walsh";
		students[0].email = "bwalsh@gmail.com";
		students[0].subject1 = 90.4;
		students[0].subject2 = 77;
		students[0].subject3 = 43;

		students[1] = new Student(66);
		students[1].fname = "Donald";
		students[1].fname = "Red";
		students[1].email = "dred@gmail.com";
		students[1].subject1 = 46.0;
		students[1].subject2 = 47;
		students[1].subject3 = 67;

		students[2] = new Student(3);
		students[2].fname = "Luna";
		students[2].fname = "Moon";
		students[2].email = "lmoon@gmail.com";
		students[2].subject1 = 55;
		students[2].subject2 = 76;
		students[2].subject3 = 38;

		// sum of all values in array using for loop
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
			// students[i] += array[i];
		}
	}

}

class Student {
	int ID;
	String fname;
	String lname;
	String email;
	double subject1;
	double subject2;
	double subject3;

	public Student(int ID) {
		this.ID = ID;
	}

	public double displayAverage() {
		double avg = subject1 + subject2 + subject3;
		return avg;
	}

	@Override
	public String toString() {
		return "Student [ID=" + ID + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", subject1="
				+ subject1 + ", subject2=" + subject2 + ", subject3=" + subject3 + ", Average of subject = "
				+ displayAverage() + "]";
	}

}
