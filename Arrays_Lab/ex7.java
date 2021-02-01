package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int[] condense = new int[numbers.length - 1];

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int number = 0; number < numbers.length - 1; number++) {
                condense[number] = numbers[number] + numbers[number + 1];
                numbers[number] = condense[number];
            }
        }

        System.out.println(numbers[0]);
    }
}
