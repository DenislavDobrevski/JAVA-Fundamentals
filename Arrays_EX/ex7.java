package Arrays_EX;

import java.util.Arrays;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int longestNumber = -1;
        int longestSequence = 0;
        int currentSequenceLength = 1;
        for (int i = 0; i < numbers.length - 1; i++) {

            if(numbers[i] == numbers[i + 1]) {
                currentSequenceLength++;
                    if(currentSequenceLength > longestSequence) {
                        longestSequence = currentSequenceLength;
                        longestNumber = numbers[i];
                    }
            } else {
                currentSequenceLength = 1;
            }
        }

        for (int i = 1; i <= longestSequence; i++) {
            System.out.print(longestNumber + " ");
        }


    }
}
