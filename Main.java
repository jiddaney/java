
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2,res;

        int operator;

        do {

            System.out.println("Choose an operation:\n"+
                    "1. Addition (+)\n"+
                    "2. Subtraction (-)\n"+
                    "3. Multiplication (*)\n"+
                    "4. Division (/)\n"+
                    "5. Power (^)\n"+
                    "6. Square Root (√)\n"+
                    "7. Factorial (!)\n"+
                    "8. Exit\n");




            operator = scanner.nextInt();
            if (operator==7 || operator ==6){
                System.out.print("Enter one numbers: ");
                num1 = scanner.nextDouble();
                num2=1;
            }else{
              double[]numbor = NUmber();
                num1 = numbor[0];
                num2 = numbor[1];


            }


            switch (operator) {
                case 1:

                    System.out.println(num1 + " + " + num2 + " = " + String.format("%.2f",addition(num1, num2)));
                    break;
                case 2:

                    System.out.println(num1 + " - " + num2 + " = " + String.format("%.2f",substruction(num1, num2)));
                    break;
                case 3:

                    System.out.println(num1 + " * " + num2 + " = " +String.format("%.2f",multipl(num1, num2)));
                    break;
                case 4:
                    double[] nums = NUmber();
                    num1 = nums[0];
                    num2 = nums[1];
                   

                    do {
                        System.out.println("ERROR U CAN'T / 0");
                        nums = NUmber();
                        num1 = nums[0];
                        num2 = nums[1];
                    }while (num2 == 0);

                    System.out.println(num1 + " / " + num2 + " = " + String.format("%.2f", divisionn(num1, num2)));
                    break;


                case 5:

                    System.out.println(num1 + " ^ " + num2 + " = " +String.format("%.2f",power(num1, num2)));
                    break;
                case 6:
                    res = squareRoot(num1);
                    System.out.println("squar de num 1 est :" +String.format("%.2f",res));
                    break;
                case 7:
                    res = factorial(num1);
                    System.out.println("factorial de num 1 est :" +res );
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
        int i,res;
        res=1;
        for (i=1;i<=number;i++){
            res = res *i;
        }
        return res;

    }
   static double[] NUmber (){
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[2];
       System.out.print("Enter two numbers: ");
       numbers[0] = scanner.nextDouble();
       scanner.nextLine();
       numbers[1] = scanner.nextDouble();
       scanner.nextLine();
       return numbers;
   }
}