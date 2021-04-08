package MidExam_2;

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
        while (!input[0].equals("END")) {
            switch (input[0]) {
                case "add": {
                    if (input[2].equals("start")) {
                        for (int i = input.length - 1; i >= 3; i--) {
                            int currentNumber = Integer.parseInt(input[i]);
                            numbers.add(0, currentNumber);
                        }
                    } else if (input[2].equals("end")) {
                        for (int i = 3; i < input.length; i++) {
                            int currentNumber = Integer.parseInt(input[i]);
                            numbers.add(currentNumber);
                        }
                    }
                    break;
                }
                case "remove": {
                    String command = input[1];

                    switch (command) {
                        case "lower": {
                            int value = Integer.parseInt(input[3]);
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) < value) {
                                    numbers.remove(i);
                                    i--;
                                }
                            }
//                            numbers.removeIf(number -> number < value);
                            break;
                        }
                        case "greater": {
                            int value = Integer.parseInt(input[3]);
//                            numbers.removeIf(number -> number > value);
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) > value) {
                                    numbers.remove(i);
                                    i--;
                                }
                            }
                            break;
                        }
                        case "at":
                            int index = Integer.parseInt(input[3]);
                            if (index >= 0 && index < numbers.size()) {
                                numbers.remove(index);
                            }
                            break;
                        case "count":
                            int count = Integer.parseInt(input[2]);
                            while (count > 0 && numbers.size() > 0) {
                                numbers.remove(numbers.size() - 1);
                                count--;
                            }
                            break;
                    }

                    break;
                }
                case "replace": {
                    int value = Integer.parseInt(input[1]);
                    int replacement = Integer.parseInt(input[2]);
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) == value) {
                            numbers.set(i, replacement);
                            break;
                        }
                    }
                    break;
                }
                case "find": {
                    if (input[1].equals("odd")) {
                        for (Integer number : numbers) {
                            if (number % 2 == 1) {
                                System.out.printf("%d ", number);
                            }
                        }
                        System.out.println();
                    } else if (input[1].equals("even")) {
                        for (Integer number : numbers) {
                            if (number % 2 == 0) {
                                System.out.printf("%d ", number);
                            }
                        }
                        System.out.println();
                    }
                    break;
                }
            }

            input = scan.nextLine().split(" ");
        }

        System.out.println(numbers.toString().

                replaceAll("[\\[\\]]", ""));

    }
}
