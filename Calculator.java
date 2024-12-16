import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Welcome to the calculator!");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.print("Please choose what you would like to do: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.print("Please enter the first number: ");
        double a = scan.nextDouble();
        System.out.print("Please enter the second number: ");
        double b = scan.nextDouble();
        double result = 0;
        if(input == 1) result = add(a, b);
        else if(input == 2) result = subtract(a, b);
        else System.out.println("Sorry invalid input.");
        System.out.println("Result: "+result);
        scan.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }
    
    public static double subtract(double a, double b) {
        return a - b;
    }
}