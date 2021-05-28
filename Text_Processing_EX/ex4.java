package Text_Processing_EX;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        for (int i = 0; i < text.length(); i++) {
            int currentDigit = text.charAt(i) + 3;
            System.out.print((char) currentDigit);
        }
    }
}
