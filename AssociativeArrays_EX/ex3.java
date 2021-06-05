package AssociativeArrays_EX;

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<String, Integer> resources = new TreeMap<>();
        TreeMap<String, Integer> junk = new TreeMap<>();

        resources.put("fragments", 0);
        resources.put("shards", 0);
        resources.put("motes", 0);

        boolean legendaryFould = false;
        String winningResource = "";

        while (!legendaryFould) {
            String[] input = scan.nextLine().toLowerCase().split("\\s+");

            for (int i = 0; i < input.length; i = i + 2) {
                String resource = input[i + 1];
                int quantity = Integer.parseInt(input[i]);

                if(resources.containsKey(resource)) {
                    resources.put(resource, resources.get(resource) + quantity);
                    if (resources.get(resource) >= 250) {
                        resources.put(resource, resources.get(resource) - 250);
                        winningResource = resource;
                        legendaryFould = true;
                        break;
                    }
                } else {
                    if(!junk.containsKey(resource)) {
                        junk.put(resource, quantity);
                    } else {
                        junk.put(resource, resources.get(resource) + quantity);
                    }
                }

            }

        }

        switch (winningResource) {
            case "shards":
                System.out.println("Shadowmourne obtained!");
                break;
            case "fragments":
                System.out.println("Valanyr obtained!");
                break;
            case "motes":
                System.out.println("Dragonwrath obtained!");
                break;
        }

        resources
                .entrySet()
                .stream()
                .sorted((i1,i2) -> Integer.compare(i2.getValue(), i1.getValue()))
                .forEach(i -> System.out.printf("%s: %d%n", i.getKey(), i.getValue()));

        junk
                .entrySet()
                .forEach(i -> System.out.printf("%s: %d%n", i.getKey(), i.getValue()));

    }
}
