package Lists_EX;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scan.nextLine());

        String[] input = scan.nextLine().split(" ");

        while (!input[0].equals("end")) {
            if (input[0].equals("Add")) {
                int passengers = Integer.parseInt(input[1]);
                wagons.add(passengers);
            } else {
                int passengers = Integer.parseInt(input[0]);

                for (int i = 0; i < wagons.size(); i++) {
                    if ((wagons.get(i) + passengers) <= maxCapacity) {
                        wagons.set(i, (wagons.get(i) + passengers));
                        break;
                    }
                }

            }

            input = scan.nextLine().split(" ");
        }

        System.out.print(wagons.toString().replaceAll("[\\[\\],]", ""));
    }
}
