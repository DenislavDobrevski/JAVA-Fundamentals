package Arrays_EX;

import java.util.Arrays;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int i = 0; i < numbers.length - 1; i++) {
            boolean isBigger = true;
            for (int j = i; j < numbers.length - 1; j++) {
                if(numbers[i] < numbers[j+1]) {
                    isBigger = false;
                }
            }
            if(isBigger) {
                System.out.print(numbers[i] + " ");
            }

        }
        System.out.print(numbers[numbers.length - 1]);

    }
}
