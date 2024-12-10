import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2,res;
        int operator;

        do {
            System.out.print("Enter two numbers: ");
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();
            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Power (^)");
            System.out.println("6. Square Root (√)");
            System.out.println("7. Factorial (!)");
            System.out.println("8. Exit");


                operator = scanner.nextInt();


                switch (operator) {
                    case 1:

                        System.out.println(num1 + " + " + num2 + " = " + addition(num1, num2));
                        break;
                    case 2:

                        System.out.println(num1 + " + " + num2 + " = " + substruction(num1, num2));
                        break;
                    case 3:

                        System.out.println(num1 + " + " + num2 + " = " + multipl(num1, num2));
                        break;
                    case 4:

                        System.out.println(num1 + " + " + num2 + " = " + divisionn(num1, num2));
                        break;
                    case 5:

                        System.out.println(num1 + " + " + num2 + " = " + power(num1, num2));
                        break;
                    case 6:
                       res = squareRoot(num1);
                        System.out.println(num1 + " + " + num2 + " = " + res);
                        break;
                    case 7:
                        res = factorial(num1);
                        System.out.println(num1 + " + " + num2 + " = " +res );
                        break;
                    case 8:
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid operator.");
                }

        } while (operator != 8);
    }


    public static double addition(double num1, double num2) {
        return num1 + num2;
    }
    public static double divisionn(double num1, double num2) {
        return num1 / num2;
    }

    public static double multipl(double num1, double num2) {
        return num1 * num2;
    }
    public static double substruction(double num1, double num2) {
        return num1 - num2;
    }
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    public static double factorial(double number) {
        if (number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}