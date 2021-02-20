package Methods_Lab;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String operation = scan.nextLine();
        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());

        switch (operation) {
            case "add":
                add(firstNumber, secondNumber);
                break;
            case "multiply":
                multiply(firstNumber, secondNumber);
                break;
            case "subtract":
                subtract(firstNumber, secondNumber);
                break;
            case "divide":
                divide(firstNumber, secondNumber);
                break;
        }
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    public static void divide(int a, int b) {
        System.out.println(a / b);
    }
}
