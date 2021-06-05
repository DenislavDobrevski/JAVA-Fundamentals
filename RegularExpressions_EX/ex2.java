package RegularExpressions_EX;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, Integer> racers = new LinkedHashMap<>();
        String[] names = scan.nextLine().split(", ");

        String input = scan.nextLine();
        Pattern digits = Pattern.compile("[0-9]");
        Pattern letters = Pattern.compile("[A-Za-z]+");
        while (!input.equals("end of race")) {
            Matcher matcherForLetters = letters.matcher(input);
            Matcher matcherForDigits = digits.matcher(input);
            String name = "";
            String distance = "";
            while (matcherForLetters.find()) {
                name += matcherForLetters.group();
            }
            while (matcherForDigits.find()) {
                distance += matcherForDigits.group();
            }
            int distanceInKm = 0;
            for (int i = 0; i < distance.length(); i++) {
                distanceInKm += Integer.parseInt(String.valueOf(distance.charAt(i)));
            }
            for (String n : names) {
                if (n.equals(name)) {
                    if (!racers.containsKey(name)) {
                        racers.put(name, distanceInKm);
                    } else {
                        racers.put(name, racers.get(name) + distanceInKm);
                    }
                }
            }

            input = scan.nextLine();
        }
        LinkedHashMap<String, Integer> newMap = new LinkedHashMap<>();
        newMap = racers.entrySet().stream()
                .sorted((l, r) -> Integer.compare(r.getValue(), l.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        int counter = 1;
        for (Map.Entry<String, Integer> entry : newMap.entrySet()) {
            if (counter == 1) {
                System.out.printf("1st place: %s%n", entry.getKey());
                counter++;
            } else if (counter == 2) {
                System.out.printf("2nd place: %s%n", entry.getKey());
                counter++;
            } else if (counter == 3) {
                System.out.printf("3rd place: %s%n", entry.getKey());
                counter++;

            }
        }

    }
}
