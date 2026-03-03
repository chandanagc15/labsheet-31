import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Choose an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } 
        else if (operator == '-') {
            result = num1 - num2;
        } 
        else if (operator == '*') {
            result = num1 * num2;
        } 
        else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error! Division by zero.");
                return;
            }
        } 
        else {
            System.out.println("Invalid Operator!");
            return;
        }

        System.out.println("Result: " + result);
        System.out.println("Success");
        System.out.println("done");
        sc.close();
    }
}
