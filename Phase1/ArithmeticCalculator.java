package Phase1;
import java.util.Scanner;
public class ArithmeticCalculator {
	public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Division by zero is not allowed.");
            return Integer.MIN_VALUE; 
        }
    }
    public static void main(String[] args) {

        ArithmeticCalculator ac = new ArithmeticCalculator();

        Scanner sc = new Scanner(System.in);

        System.out.println("Basic Calculator!");

        System.out.print("Enter the value one: ");
        int a = sc.nextInt();

        System.out.print("Enter the value Second: ");
        int b = sc.nextInt();

        System.out.println("Operations:");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        System.out.print("Select one operation: ");
        int operation = sc.nextInt();
        int result = 0;

        switch (operation) {
            case 1:
                result = ac.addition(a, b);
                break;
            case 2:
                result = ac.subtraction(a, b);
                break;
            case 3:
                result = ac.multiplication(a, b);
                break;
            case 4:
                result = ac.division(a, b);
                break;
            default:
                System.out.println("Invalid operation selected.");
                break;
        }
        if (result != Integer.MIN_VALUE) {
            System.out.println("Result: " + result);
        }
    }
}

