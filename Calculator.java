import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Welcome to the calculator!");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Remainder");
        System.out.print("Please choose what you would like to do: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if(input < 1 || input > 5) {
            System.out.println("Sorry invalid input.");
        } else {
            System.out.print("Please enter the first number: ");
            double a = scan.nextDouble();
            System.out.print("Please enter the second number: ");
            double b = scan.nextDouble();
            double result = 0;
            if(input == 1) result = add(a, b);
            else if(input == 2) result = subtract(a, b);
            else if(input == 3) result = multiply(a, b);
            else if(input == 4) result = divide(a, b);
            else if(input == 5) result = remainder(a, b);
            System.out.println("Result: "+result);
        }
        scan.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }
    
    public static double subtract(double a, double b) {
        if(b == 0) return 0;
        return a - b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double remainder(double a, double b) {
        return a % b;
    }

}