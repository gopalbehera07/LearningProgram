package TheCalculatorDilemma;

public class Calculator {
    public static double performOperation(double num1, double num2, char operator) {
    double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        double operand1 = 10.0;
        double operand2 = 5.0;
        char operation = '+';

        double result = performOperation(operand1, operand2, operation);
        System.out.println("Result: " + result);
    }
}
