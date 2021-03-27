package Text_Processing_Lab;

import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char element = input.charAt(i);
            if(isDigit(element)) {
                digits.append(element);
            } else if(isLetter(element)) {
                letters.append(element);
            } else {
                others.append(element);
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);

    }
}
