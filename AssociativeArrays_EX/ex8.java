package AssociativeArrays_EX;

import java.util.*;

public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<String, List<String>> companies = new TreeMap<>();
        String[] input = scan.nextLine().split(" -> ");

        while (!input[0].equals("End")) {
            String company = input[0];
            String id = input[1];
            boolean containsId = false;

            companies.putIfAbsent(company, new ArrayList<>());

                for (int i = 0; i < companies.get(company).size(); i++) {
                    if (companies.get(company).get(i).equals(id)) {
                        containsId = true;
                        break;

                    }
                }

            if (!containsId) {
                companies.get(company).add(id);
            }

            input = scan.nextLine().split(" -> ");
        }

        companies.entrySet().stream()
                .forEach(e -> {
                    System.out.println(e.getKey());
                    e.getValue()
                            .stream()
                            .forEach(x -> System.out.printf("-- %s%n", x));
                });


    }
}
