package AssociativeArrays_EX;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();

        String resource = scan.nextLine();
        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scan.nextLine());
            if(!resources.containsKey(resource)){
                resources.put(resource, quantity);
            } else{
                resources.put(resource, resources.get(resource) + quantity);
            }
            resource = scan.nextLine();
        }

        for (Map.Entry<String, Integer> res : resources.entrySet()) {
            System.out.printf("%s -> %d%n", res.getKey(), res.getValue());
        }
    }
}
