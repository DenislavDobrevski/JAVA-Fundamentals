package MidExam;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String[] input = scan.nextLine().split(" ");

        while (!input[0].equals("end")) {
            switch (input[0]) {
                case "swap":
                    array = swapNumbers(input[1], input[2], array);
                    break;
                case "multiply":
                    array = multiplyNumbers(input[1], input[2], array);
                    break;
                case "decrease":
                    array = decreaseArray(array);
                    break;
            }

            input = scan.nextLine().split(" ");
        }


        for (int i = 0; i < array.length - 1; i++) {
            System.out.printf("%d, ", array[i]);
        }
        System.out.print(array[array.length - 1]);
    }

    private static int[] decreaseArray(int[] array) {
        for (int i = 0; i <array.length ; i++) {
            array[i] = array[i] - 1;
        }

        return array;
    }

    private static int[] swapNumbers(String firstNumber, String secondNumber, int[] array) {
        int n1 = Integer.parseInt(firstNumber);
        int n2 = Integer.parseInt(secondNumber);

        int swap = array[n1];
        array[n1] = array[n2];
        array[n2] = swap;

        return array;
    }

    private static int[] multiplyNumbers(String firstNumber, String secondNumber, int[] array) {
        int n1 = Integer.parseInt(firstNumber);
        int n2 = Integer.parseInt(secondNumber);

        array[n1] = array[n1] * array[n2];

        return array;
    }
}
