package Lists_EX;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        String[] input = scan.nextLine().split("\\s+");

        while (!input[0].equals("End")) {
            switch (input[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(input[1]));
                    break;
                case "Insert":
                    int index = Integer.parseInt(input[2]);
                    int maxIndex = numbers.size() - 1;
                    int number = Integer.parseInt(input[1]);
                    if (index > maxIndex) {
                        System.out.println("Invalid Index");
                    } else {
                        numbers.add(index, number);
                    }
                    break;
                case "Remove":
                    int index2 = Integer.parseInt(input[1]);
                    int maxIndex2 = numbers.size() - 1;
                    if (index2 <= maxIndex2) {
                        numbers.remove(Integer.parseInt(input[1]));
                    } else {
                        System.out.println("Invalid Index");
                    }
                    break;
                case "Shift":
                    if (input[1].equals("left")) {
                        for (int i = 0; i < Integer.parseInt(input[2]); i++) {
                            int temp = numbers.get(0);
                            numbers.remove(0);
                            numbers.add(temp);
                        }
                    } else if (input[1].equals("right")) {
                        for (int i = 0; i < Integer.parseInt(input[2]); i++) {
                            int temp = numbers.get(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);
                            numbers.add(0, temp);
                        }
                    }
                    break;
            }

            input = scan.nextLine().split(" ");
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

    }
}
