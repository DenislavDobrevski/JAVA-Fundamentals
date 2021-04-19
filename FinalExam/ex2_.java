package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex2_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            Pattern pattern = Pattern.compile("!([A-Z][a-z]{3,})!:\\[([A-Za-z]{8,})\\]");
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                System.out.printf("%s: ", matcher.group(1));
                String message = matcher.group(2);
                for (int j = 0; j < message.length(); j++) {
                    System.out.printf("%d ", (int) message.charAt(j));
                }
                System.out.println();
            } else {
                System.out.println("The message is invalid");
            }
        }


    }
}
