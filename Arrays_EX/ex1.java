package Arrays_EX;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scan.nextLine());
        }

        int totalPasengers = 0;
        for (int people : arr) {
            totalPasengers += people;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(totalPasengers);
    }
}
