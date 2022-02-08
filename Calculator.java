import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    String operator;
    Double number1, number2, result;

    //obj of Scanner class
    Scanner input = new Scanner(System.in);

    //enter operator
    System.out.println("Choose an operator: Add, Subtract, Multiply, or Divide");
    operator = input.nextLine();

    //enter numbers
    System.out.println("Enter first operand");
    number1 = input.nextDouble();

    System.out.println("Enter second operand");
    number2 = input.nextDouble();

    switch (operator) {

      //addition between numbers
      case "Add":
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      //subtraction between numbers
      case "Subtract":
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      //multiplication between numbers
      case "Multiply":
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      //division between numbers
      case "Divide":
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid Entry, Try Again");
        System.exit(0);
        break;
    }

    input.close();
  }
}