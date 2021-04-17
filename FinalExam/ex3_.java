package FinalExam;

import java.util.*;

public class ex3_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, List<String>> guests = new LinkedHashMap<>();
        String[] input = scan.nextLine().split("-");

        int unlikedMeals = 0;
        while (!input[0].equals("Stop")) {
            String command = input[0];
            String name = input[1];
            String meal = input[2];

            switch (command) {
                case "Like":
                    if (!guests.containsKey(name)) {
                        guests.put(name, new ArrayList<>());
                        guests.get(name).add(meal);
                    } else {
                        if (!guests.get(name).contains(meal)) {
                            guests.get(name).add(meal);
                        }
                    }
                    break;
                case "Unlike":
                    if (guests.containsKey(name)) {
                        if (guests.get(name).contains(meal)) {
                            guests.get(name).remove(meal);
                            System.out.printf("%s doesn't like the %s.%n", name, meal);
                            unlikedMeals++;
                        } else {
                            System.out.printf("%s doesn't have the %s in his/her collection.%n", name, meal);
                        }
                    } else {
                        System.out.printf("%s is not at the party.%n", name);
                    }
                    break;
            }

            input = scan.nextLine().split("-");
        }

//                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
        guests.entrySet().stream()
                .sorted((x1, x2) -> {
                    int result = x2.getValue().size() - x1.getValue().size();
                    if (result == 0) {
                        result = x1.getKey().compareTo(x2.getKey());
                    }
                    return result;
                })
                .forEach(e -> {
                    System.out.printf("%s: %s%n", e.getKey(),
                            e.getValue().toString().replaceAll("[\\[\\]]", ""));
                });


        System.out.printf("Unliked meals: %d", unlikedMeals);
    }
}
