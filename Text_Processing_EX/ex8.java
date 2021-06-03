package Text_Processing_EX;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        double totalResult = 0.00;

        for (int i = 0; i < input.length; i++) {
            StringBuilder sb = new StringBuilder(input[i]);
            char firstLetter = sb.charAt(0);
            char lastLetter = sb.charAt(sb.length() - 1);
            sb.deleteCharAt(0);
            sb.deleteCharAt(sb.length() - 1);
            double number = Double.parseDouble(sb.toString());
            double currentResult = 0.00;

            if (firstLetter >= 65 && firstLetter <= 90) {
                currentResult = number / (firstLetter - 64);
            } else if (firstLetter >= 97 && firstLetter <= 122) {
                currentResult = number * (firstLetter - 96);
            }

            if (lastLetter >= 65 && lastLetter <= 90) {
                currentResult -= (lastLetter - 64);
            } else if (lastLetter >= 97 && lastLetter <= 122) {
                currentResult += (lastLetter - 96);
            }

            totalResult += currentResult;
        }

        System.out.printf("%.2f", totalResult);


    }
}
