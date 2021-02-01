package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] symbols = scan.nextLine().split(" ");

        for (int i = symbols.length - 1; i >= 0 ; i--) {
            System.out.printf("%s ", symbols[i]);
        }
    }
}
