package MethodOverloadingCalculator;

public class OverloadedCalculator {
	  public static double calculate(double num1, double num2, char operator) {
	        switch (operator) {
	            case '+':
	                return num1 + num2;
	            case '-':
	                return num1 - num2;
	            case '*':
	                return num1 * num2;
	            case '/':
	                if (num2 != 0) {
	                    return num1 / num2;
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                    return Double.NaN; // Not-a-Number value to indicate error
	                }
	            default:
	                System.out.println("Error: Invalid operator.");
	                return Double.NaN;
	        }
	    }

	    public static void main(String[] args) {
	        java.util.Scanner scanner = new java.util.Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        System.out.print("Enter the operator (+, -, *, /): ");
	        char operator = scanner.next().charAt(0);

	        double result = calculate(num1, num2, operator);

	        if (!Double.isNaN(result)) {
	            System.out.println("Result: " + result);
	        }

	        scanner.close();
	    }
}
