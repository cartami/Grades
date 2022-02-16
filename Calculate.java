import java.util.Scanner;

class Calculate {

	public static void add(double number1, double number2) {
		double result = number1 + number2;
		System.out.println(number1 + " + " + number2 + " = " + result);
	}

	public static void subtract(double number1, double number2) {
		double result = number1 - number2;
		System.out.println(number1 + " - " + number2 + " = " + result);
	}

	// Method for multiplication
	public static void multiply(double number1, double number2) {
		double result = number1 * number2;
		System.out.println(number1 + " * " + number2 + " = " + result);
	}

	// Method for division
	public static void divide(double number1, double number2) {
		double result = number1 / number2;
		System.out.println(number1 + " / " + number2 + " = " + result);
	}

	public static void main(String[] args) {
		Double number1, number2;

		// obj of Scanner class
		Scanner input = new Scanner(System.in);

		// enter numbers
		System.out.println("Enter first operand");
		number1 = input.nextDouble();

		System.out.println("Enter second operand");
		number2 = input.nextDouble();

		add(number1, number2);
		subtract(number1, number2);
		multiply(number1, number2);
		divide(number1, number2);
		input.close();
	}
}