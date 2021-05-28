package Text_Processing_EX;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] usernames = scan.nextLine().split(", ");

        for (String current : usernames) {
            boolean isValid = true;


            for (int j = 0; j < current.length(); j++) {
                char currentChar = current.charAt(j);
                if (!Character.isLetter(currentChar)) {
                    if (!Character.isDigit(currentChar)) {
                        if (currentChar != '-' && currentChar != '_') {
                            isValid = false;
                            break;
                        }
                    }
                }
            }

            if (current.length() >= 3 && current.length() <= 16) {
                if (isValid) {
                    System.out.println(current);
                }
            }
        }


    }
}
