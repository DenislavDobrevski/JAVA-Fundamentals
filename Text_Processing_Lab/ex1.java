package Text_Processing_Lab;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        while (!"end".equals(input)) {
            String word = input;
            StringBuilder reversed = new StringBuilder(input);
            reversed.reverse();

            System.out.printf("%s = %s%n", word, reversed);

            input = scan.nextLine();
        }
    }

}
