package BuiltInFunction;
	import java.util.Scanner;

	public class BasicCalculator {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        double num1 = sc.nextDouble();

	        System.out.print("Enter second number: ");
	        double num2 = sc.nextDouble();

	        System.out.println("Choose operation: + - * /");
	        char op = sc.next().charAt(0);

	        double result = 0;
	        boolean valid = true;

	        switch (op) {
	            case '+':
	                result = add(num1, num2); break;
	            case '-':
	                result = subtract(num1, num2); break;
	            case '*':
	                result = multiply(num1, num2); break;
	            case '/':
	                if (num2 == 0) {
	                    System.out.println("Cannot divide by zero.");
	                    valid = false;
	                } else {
	                    result = divide(num1, num2);
	                }
	                break;
	            default:
	                System.out.println("Invalid operation.");
	                valid = false;
	        }

	        if (valid) {
	            System.out.println("Result: " + result);
	        }
	        sc.close();
	    }
	    static double add(double a, double b) { return a + b; }
	    static double subtract(double a, double b) { return a - b; }
	    static double multiply(double a, double b) { return a * b; }
	    static double divide(double a, double b) { return a / b; }
	}

