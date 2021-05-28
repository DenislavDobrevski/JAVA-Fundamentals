package Text_Processing_EX;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\\\");
        String[] file = input[input.length - 1].split("\\.");

        System.out.printf("File name: %s%n", file[0]);
        System.out.printf("File extension: %s%n", file[1]);
    }
}
