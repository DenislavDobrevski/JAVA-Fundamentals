package Methods_Lab;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        number = Math.abs(number);
        System.out.println(getMultiplyOfEvenAndOdds(number));
    }

    public static int getMultiplyOfEvenAndOdds(int number) {
        int sumOdds = sumOfOdds(number);
        int sumEvens = sumOfEvens(number);
        return sumOdds * sumEvens;

    }

    public static int sumOfOdds (int number) {
        int sumOdd = 0;
        while (number > 0) {
            int digit = number % 10;
            if(digit % 2 != 0) {
                sumOdd += digit;
            }
            number /= 10;
        }

        return sumOdd;
    }

    public static int sumOfEvens (int number) {
        int sumEven = 0;
        while (number > 0) {
            int digit = number % 10;
            if(digit % 2 == 0) {
                sumEven += digit;
            }
            number /= 10;
        }

        return sumEven;
    }


}
