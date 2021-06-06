package AssociativeArrays_EX;

import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, List<Double>> orders = new LinkedHashMap<>();
        String[] input = scan.nextLine().split("\\s+");

        while (!input[0].equals("buy")) {
            String product = input[0];
            double price = Double.parseDouble(input[1]);
            double quantity = Double.parseDouble(input[2]);

            if(!orders.containsKey(product)){
                orders.put(product, new ArrayList<>());
                orders.get(product).add(price);
                orders.get(product).add(quantity);
            } else {
                double oldPrice = orders.get(product).get(0);
                orders.get(product).set(1, orders.get(product).get(1) + quantity);
                if(oldPrice != price) {
                    orders.get(product).set(0, price);
                }
            }


            input = scan.nextLine().split("\\s+");
        }

        for (String s : orders.keySet()) {
            double totalPrice = orders.get(s).get(0) * orders.get(s).get(1);
            orders.get(s).remove(1);
            orders.get(s).remove(0);
            orders.get(s).add(totalPrice);
        }

        for (Map.Entry<String, List<Double>> entry : orders.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), orders.get(entry.getKey()).get(0));
        }

    }
}
