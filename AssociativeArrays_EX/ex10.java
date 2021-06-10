package AssociativeArrays_EX;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, Integer> languages = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> submissions = new LinkedHashMap<>();
        String[] input = scan.nextLine().split("-");

        while (!input[0].equals("exam finished")) {
            if (!input[1].equals("banned")) {
                String username = input[0];
                String language = input[1];
                int points = Integer.parseInt(input[2]);

                if(!languages.containsKey(username)) {
                    languages.put(username, points);
                } else {
                    if(languages.get(username) < points) {
                        languages.put(username, points);
                    }
                }

                submissions.putIfAbsent(language, 0);
                submissions.put(language, submissions.get(language) + 1);
            } else {
                String username = input[0];
                for (Map.Entry<String, Integer> entry : languages.entrySet()) {
                    if (entry.getKey().equals(username)) {
                        languages.remove(entry.getKey());
                    }
                }
            }


            input = scan.nextLine().split("-");
        }

        System.out.println("Results:");
        languages.entrySet().stream()
                .sorted((x1, x2) -> {
                    int result = x2.getValue() - x1.getValue();
                    if (result == 0) {
                        result = x1.getKey().compareTo(x2.getKey());
                    }
                    return result;
                })
                .forEach(e -> System.out.printf("%s | %d%n", e.getKey(), e.getValue()));

        System.out.println("Submissions:");
        submissions.entrySet().stream()
                .sorted((x1, x2) -> {
                    int result = x2.getValue() - x1.getValue();
                    if (result == 0) {
                        result = x1.getKey().compareTo(x2.getKey());
                    }
                    return result;
                })
                .forEach(e -> System.out.printf("%s - %d%n",e.getKey(), e.getValue()));
    }
}
