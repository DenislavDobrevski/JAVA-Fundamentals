package Lists_EX;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] input = scan.nextLine().split(" ");

        while (!input[0].equals("end")) {
            if (input[0].equals("Delete")) {
                int blackNumber = Integer.parseInt(input[1]);
                while (numbers.contains(blackNumber)) {
                    numbers.remove(Integer.valueOf(blackNumber));
                }
            } else if (input[0].equals("Insert")) {
                numbers.add(Integer.parseInt(input[2]), Integer.parseInt(input[1]));
            }
            input = scan.nextLine().split(" ");
        }

        System.out.print(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
