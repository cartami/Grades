package Week2_HW3;

import java.util.Scanner;

public class OOPConcepts {

	public static void main(String[] args) {
		
		int id, age;
		double salary;
		String fname, lname, email;
		char gender;

		// obj of Scanner class
		Scanner input = new Scanner(System.in);

		// enter numbers
		System.out.println("Enter ID");
		id = input.nextInt();
		
		System.out.println("Enter age");
		age = input.nextInt();

		System.out.println("Enter first name");
		fname = input.next();
		
		System.out.println("Enter last name");
		lname = input.next();
		
		System.out.println("Enter gender");
		gender = input.next().charAt(0);
		
		System.out.println("Enter email");
		email = input.next();
		
		System.out.println("Enter salary");
		salary = input.nextDouble();
		
		
		Employee emp = new Employee(id,fname,age,gender,salary);
		Student student = new Student(id,fname,lname,email);
		Person1 person1 = new Person1(fname,age,gender);
		input.close();
		
	}

}
