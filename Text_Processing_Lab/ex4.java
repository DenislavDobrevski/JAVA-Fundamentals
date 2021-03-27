package Text_Processing_Lab;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] bannedWords = scan.nextLine().split(", ");
        String text = scan.nextLine();

        for (String word : bannedWords) {
            String replacement = astrisksCount(word, word.length());
            text = text.replace(word, replacement);
        }

        System.out.println(text);
    }

    private static String astrisksCount(String word, int length) {
        StringBuilder astrisks = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            astrisks.append("*");
        }
        return astrisks.toString();
    }
}
