package Methods_Lab;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= number; i++) {
            printUpperHalf(1, i);
        }
        for (int i = number - 1; i >= 1; i--) {
            printLowerHalf(1, i);
        }
    }


    public static void printUpperHalf(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    public static void printLowerHalf(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
