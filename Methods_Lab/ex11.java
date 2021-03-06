package Methods_Lab;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        String operation = scan.nextLine();
        int secondNumber = Integer.parseInt(scan.nextLine());

        System.out.println(getResult(firstNumber, operation, secondNumber));
    }

    public static int getResult(int firstNumber, String operation, int secondNumber) {
        int result = 0;
        switch (operation) {
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
        }

        return result;
    }


}
