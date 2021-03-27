package Text_Processing_Lab;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String deletedWord = scan.nextLine();
        String text = scan.nextLine();

        while(text.contains(deletedWord)) {
            text = text.replace(deletedWord, "");
        }

        System.out.println(text);
    }
}
