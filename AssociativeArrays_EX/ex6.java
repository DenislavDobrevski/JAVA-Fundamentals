package AssociativeArrays_EX;

import java.util.*;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, List<String>> courses = new LinkedHashMap<>();
        String[] input = scan.nextLine().split(" : ");

        while (!input[0].equals("end")) {
            String course = input[0];
            String name = input[1];

            courses.putIfAbsent(course, new ArrayList<>());
            courses.get(course).add(name);

            input = scan.nextLine().split(" : ");
        }

        courses
                .entrySet()
                .stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(e -> {
                    System.out.println(e.getKey() + ": " + e.getValue().size());
                    e.getValue().stream()
                            .sorted(String::compareTo)
                            .forEach(student -> System.out.println("-- " + student));
                });

    }
}
