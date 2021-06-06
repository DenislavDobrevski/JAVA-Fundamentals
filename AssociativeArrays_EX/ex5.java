package AssociativeArrays_EX;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, String> registeredUsers = new LinkedHashMap<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");

            String name = input[1];
            switch (input[0]) {
                case "register":
                    String number = input[2];
                    if (!registeredUsers.containsKey(name)) {
                        registeredUsers.put(name, number);
                        System.out.printf("%s registered %s successfully%n", name, number);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n",
                                registeredUsers.get(name));
                    }
                    break;
                case "unregister":
                    if(!registeredUsers.containsKey(name)) {
                        System.out.printf("ERROR: user %s not found%n", name);
                    } else {
                        registeredUsers.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);
                    }
                    break;
            }
        }

        registeredUsers
                .entrySet()
                .stream()
                .forEach(e -> System.out.printf("%s => %s%n",e.getKey(), e.getValue()));


    }
}
