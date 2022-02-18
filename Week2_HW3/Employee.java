package Week2_HW3;

public class Employee extends Person {
	int emp_id;
	double emp_salary;

	Employee() {

	}

	Employee(int id, String name, int age, char gender, double salary) {

		super(name, age, gender);
		emp_id = id;
		emp_salary = salary;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public double getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}

	public double calculate(int bonus) {
		double netsalary = bonus + this.emp_salary;
		return netsalary;
	}

	public int compute(int num1, int num2) {
		int time = num2 - num1;
		return time;
	}

	@Override
	public String toString() {
		return "Employee [getEmp_id()=" + getEmp_id() + ", getEmp_salary()=" + getEmp_salary() + ", getPname()="
				+ getPname() + ", getPage()=" + getPage() + ", getPgender()=" + getPgender() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	void calculate(double n1, double n2) {
		System.out.println(n1 + n2);
	}

}
