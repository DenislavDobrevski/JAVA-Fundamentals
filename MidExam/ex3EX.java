package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class ex3EX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split("@"))
                .mapToInt(Integer::parseInt).toArray();

        String[] input = scan.nextLine().split(" ");
        int cupidPosition = 0;

        while (!input[0].equals("Love!")) {
            int length = Integer.parseInt(input[1]);
            cupidPosition += length;
            if(cupidPosition >= array.length) {
                cupidPosition = 0;
            }
            for (int i = 0; i < array.length; i++) {
                if(i == cupidPosition) {
                    if(array[i] == 0) {
                        System.out.printf("Place %d already had Valentine's day.%n", i);
                    } else {
                        array[i] -= 2;
                        if (array[i] == 0) {
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
        for (int i = 0; i < array.length; i++) {
            if(array[i] != 0) {
                missedPlaces++;
            }
        }

        if(missedPlaces == 0) {
            System.out.println("Mission was successful");
        } else {
            System.out.printf("Cupid has failed %d places.", missedPlaces);
        }

    }
}
