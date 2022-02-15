
public class GetterSetters {

	public static void main(String[] args) {
		Computer comp1 = new Computer();
		Computer comp2 = new Computer();
		// setters
		comp1.setCost(400.50);
		comp2.setCost(546.50);
		comp1.setName("Dell");
		comp2.setName("HP");
		comp1.setYear(2019);
		comp2.setYear(2020);

		// using getters for both POJOs
		System.out.println(comp1);
		System.out.println(comp2); 
		
		Computer.computersSold();

	}
}

class Computer {
	private String name;
	private int year;
	private double cost;
	private static int computersSold;

	public Computer() {
		super();
		computersSold++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}	
	
	

	@Override
	public String toString() {
		return "Computer [getName()=" + getName() + ", getYear()=" + getYear() + ", getCost()=" + getCost() + "]";
	}

	public static void computersSold() {
		System.out.println("Displaying total computer sales : " + computersSold);
		System.out.println();

	}

}
