package Week2_HW3;

public class Person1 {
	static int count = 0;

	String pname;
	//private properties
	private int page;
	private char pgender;

	// constructor empty

	public Person1() {
		// count++;
//    	this("Peter",34,'M',true);
	}

	// constructor with params
	public Person1(String name, int age, char gender) {
		pname = name;
		page = age;
		pgender = gender;
		count++;
	}
//   public void display(Person obj)
//    {
//  	System.out.println("within parameterized display...");
//  	System.out.println("Name : "+obj.pname);
//
//    }

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public char getPgender() {
		return pgender;
	}

	public void setPgender(char pgender) {
		this.pgender = pgender;
	}

	@Override
	public String toString() {
		return "Person [getPname()=" + getPname() + ", getPage()=" + getPage() + ", getPgender()=" + getPgender() + "]";
	}

	public static void totalPerson() {
		System.out.println("total person objects are:" + count);
	}

}
