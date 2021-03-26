package RegularExpressions_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "\\b([\\d]{2})([\\/.-])([A-Z][a-z]{2})\\2([\\d]{4})\\b";
        String text = scan.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);


        while (matcher.find()) {

            System.out.printf("Day: %s, Month: %s, Year: %s%n",
                    matcher.group(1),
                    matcher.group(3),
                    matcher.group(4));
        }


    }
}

