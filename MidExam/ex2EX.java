package MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex2EX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array = scan.nextLine().split(" ");

        String[] input = scan.nextLine().split(" ");

        while (!input[0].equals("No")) {
            switch (input[0]) {
                case "OutOfStock":
                    for (int i = 0; i < array.length; i++) {
                        if (input[1].equals(array[i])) {
                            array[i] = "None";
                        }
                    }
                    break;
                case "Required":
                    int index = Integer.parseInt(input[2]);
                    if (index >= 0 && index < array.length) {
                        array[index] = input[1];
                    }
                    break;
                case "JustInCase":
                    array[array.length - 1] = input[1];
                    break;
            }
            input = scan.nextLine().split(" ");
        }

        for (int i = 0; i < array.length; i++) {
            if(!array[i].equals("None")) {
                System.out.print(array[i] + " ");
            }

        }

    }
}
