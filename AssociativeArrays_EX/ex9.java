package AssociativeArrays_EX;

import java.util.*;

public class ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, List<String>> forces = new LinkedHashMap<>();
        String input = scan.nextLine();
        String forceSide = "";
        String forceUser = "";


        while (!input.equals("Lumpawaroo")) {

            if (!input.contains("->")) {
                String[] filteredInput = input.split(" \\| ");
                forceSide = filteredInput[0];
                forceUser = filteredInput[1];

                if (!forces.containsKey(forceSide)) {
                    forces.put(forceSide, new ArrayList<>());
                }
                boolean check = false;

                for (Map.Entry<String, List<String>> entry : forces.entrySet()) {
                    if (entry.getValue().contains(forceUser)) {
                        check = true;
                        break;
                    }
                }

                if (!check) {
                    forces.get(forceSide).add(forceUser);
                }
            } else {
                String[] filteredInput = input.split(" -> ");
                forceSide = filteredInput[1];
                forceUser = filteredInput[0];

                for (Map.Entry<String, List<String>> entry : forces.entrySet()) {
                    if(entry.getValue().contains(forceUser)){
                        forces.get(entry.getKey()).remove(forceUser);
                    }
                }

                forces.putIfAbsent(forceSide, new ArrayList<>());
                forces.get(forceSide).add(forceUser);
                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            }

            input = scan.nextLine();
        }

        forces.entrySet()
                .stream()
                .filter(users -> users.getValue().size() > 0)
                .sorted((f, s) -> {
                    int result = s.getValue().size() - f.getValue().size(); //sorted by size descending
                    if (result == 0) {
                        result = f.getKey().compareTo(s.getKey()); //by name
                    }
                    return result;
                }).forEach(s -> {
            System.out.printf("Side: %s, Members: %d%n", s.getKey(), s.getValue().size());

            s.getValue()
                    .stream()
                    .sorted(String::compareTo)
                    .forEach(user -> System.out.printf("! %s%n", user));
        });

//        forces.entrySet().stream()
//                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
//                .forEach(e -> {
//                    if (e.getValue().size() > 0) {
//                        System.out.printf("Side: %s, Members: %s%n", e.getKey(), e.getValue().size());
//                        e.getValue().stream()
//                                .sorted()
//                                .forEach(x -> System.out.printf("! %s%n", x));
//                    }
//                });


    }
}
