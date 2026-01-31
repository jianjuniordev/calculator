package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("\nChoose operation:");
        System.out.println("1 - Sum");
        System.out.println("2 - Difference");
        System.out.println("3 - Product");
        System.out.println("4 - Quotient");

        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        Operation operation;

        switch (choice) {
            case 1:
                operation = new Sum();
                break;
            case 2:
                operation = new Difference();
                break;
            case 3:
                operation = new Product();
                break;
            case 4:
                operation = new Quotient();
                break;
            default:
                System.out.println("Invalid choice");
                scanner.close();
                return;
        }

        int result = operation.calculate(a, b);
        System.out.println("\nResult: " + result);

        scanner.close();
    }
}
