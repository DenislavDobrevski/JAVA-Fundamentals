package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex3List {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("@"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String[] input = scan.nextLine().split(" ");

        int cupidPosition = 0;
        while (!input[0].equals("Love!")) {
            int length = Integer.parseInt(input[1]);
            cupidPosition += length;
            if (cupidPosition >= numbers.size()) {
                cupidPosition = 0;
            }
            for (int i = 0; i < numbers.size(); i++) {
                if (i == cupidPosition) {
                    if (numbers.get(i) == 0) {
                        System.out.printf("Place %d already had Valentine's day.%n", i);
                    } else {
                        numbers.set(i, numbers.get(i) - 2);
                        if (numbers.get(i) == 0) {
                            System.out.printf("Place %d has Valentine's day.%n", i);
                        }
                    }
                    break;
                }
            }

            input = scan.nextLine().split(" ");
        }

        System.out.printf("Cupid's last position was %d.%n", cupidPosition);

        int missedPlaces = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) != 0) {
                missedPlaces++;
            }
        }

        if (missedPlaces == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", missedPlaces);
        }
    }
}
