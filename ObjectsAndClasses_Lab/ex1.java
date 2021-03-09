package ObjectsAndClasses_Lab;

import java.util.Random;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        Random rnd = new Random();

        for (int i = 0; i < input.length; i++) {
            int index = rnd.nextInt(input.length);
            String temp = input[i];
            input[i] = input[index];
            input[index] = temp;

        }

        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }

    }
}
