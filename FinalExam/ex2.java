package FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "([/=])([A-Z][A-Za-z]{2,})\\1";
        String text = scan.nextLine();

        List<String> allDestinations = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);


        while(matcher.find()) {
            String currentDestination = matcher.group(2);
            allDestinations.add(currentDestination);
        }

        System.out.printf("Destinations: %s%n",
                String.join(", ", allDestinations));
        System.out.printf("Travel Points: %d", allDestinations.stream().mapToInt(l -> l.length()).sum());


    }
}
