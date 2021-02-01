package Arrays_Lab;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        int[] numbers = new int[number];

        for (int i = 0; i < number; i++) {
            numbers[i] = Integer.parseInt(scan.nextLine());
        }

        for (int i = number - 1; i >= 0; i--) {
            System.out.printf("%d ", numbers[i]);
        }
    }
}
