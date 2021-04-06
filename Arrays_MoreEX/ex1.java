package Arrays_MoreEX;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {

            String currentName = scan.nextLine();
            int currentSum = 0;

            for (int j = 0; j < currentName.length(); j++) {
                if(currentName.charAt(j) == 'A' || currentName.charAt(j) == 'a' ||
                        currentName.charAt(j) == 'E' || currentName.charAt(j) == 'e' ||
                        currentName.charAt(j) == 'O' || currentName.charAt(j) == 'o' ||
                        currentName.charAt(j) == 'I' || currentName.charAt(j) == 'i' ||
                        currentName.charAt(j) == 'U' || currentName.charAt(j) == 'u'
                ) {
                    currentSum += currentName.charAt(j) * currentName.length();
                } else {
                    currentSum += currentName.charAt(j) / currentName.length();
                }
            }

            arr[i] = currentSum;
        }

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }



        for (int i = arr.length -1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
