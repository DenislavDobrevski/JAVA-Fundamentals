package Arrays_EX;

import java.util.Arrays;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine()
                .split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int numberOfRotations = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numberOfRotations; i++) {
               int swap = 0;
            for (int j = 0; j < numbers.length - 1; j++) {
                swap = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j + 1] = swap;
            }


        }
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + " ");
        }
    }
}

