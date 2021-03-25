package RegularExpressions_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "\\+359([ -])2\\1[\\d]{3}\\1[\\d]{4}\\b";
        String text = scan.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> result = new ArrayList<>();
        while (matcher.find()) {
            result.add(matcher.group());
        }

        System.out.println(result.toString().replaceAll("[\\[\\]]", ""));
    }
}
