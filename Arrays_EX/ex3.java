package Arrays_EX;

import java.util.Arrays;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 1; i <= n; i++) {
            int[] tempArray = Arrays.stream(scan.nextLine().split(" "))
                    .mapToInt(e -> Integer.parseInt(e)).toArray();

            if(i % 2 != 0) {
                firstArray[i - 1] = tempArray[0];
                secondArray[i - 1] = tempArray[1];
            } else {
                firstArray[i - 1] = tempArray[1];
                secondArray[i - 1] = tempArray[0];
            }
        }

        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
        }

    }
}
