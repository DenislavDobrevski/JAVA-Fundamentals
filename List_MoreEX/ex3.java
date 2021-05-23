package Lists_EX;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scan.nextLine());
        List<String> guests= new ArrayList<>();


        for (int i = 0; i < numberOfCommands; i++) {
            String[] input = scan.nextLine().split(" ", 2);
            switch (input[1]) {
                case "is going!":
                    if(guests.contains(input[0])){
                        System.out.printf("%s is already in the list!%n", input[0]);
                    } else {
                        guests.add(input[0]);
                    }
                    break;
                case "is not going!":
                    if(guests.contains(input[0])){
                        guests.remove(input[0]);
                    } else {
                        System.out.printf("%s is not in the list!%n", input[0]);
                    }

                    break;
            }
        }

        for (int i = 0; i < guests.size(); i++) {
            System.out.println(guests.get(i));
        }
    }
}
