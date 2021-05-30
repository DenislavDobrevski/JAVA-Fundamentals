package Text_Processing_EX;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder sb = new StringBuilder(input);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < sb.length() - 1; i++) {
            char currentChar = sb.charAt(i);

            while (i < sb.length() - 1 && currentChar == sb.charAt(i + 1)) {
                i++;
            }
            result.append(currentChar);
        }

        if (sb.charAt(sb.length() - 1) != sb.charAt(sb.length() - 2)) {
            result.append(sb.charAt(sb.length() - 1));
        }
            System.out.println(result);

    }
}
