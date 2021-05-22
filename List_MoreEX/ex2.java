package List_MoreEX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        double leftRacerTime = 0.0;
        double rightRacerTime = 0.0;

        int finishLine = (numbers.size() - 1) / 2;

        for (int i = 0; i < finishLine; i++) {
            if (numbers.get(i) == 0 && i != 0) {
                leftRacerTime *= 0.8;
            } else {
                leftRacerTime += numbers.get(i);
            }
        }

        for (int i = numbers.size() - 1; i > finishLine; i--) {
            if (numbers.get(i) == 0 && i != numbers.size() - 1) {
                rightRacerTime *= 0.8;
            } else {
                rightRacerTime += numbers.get(i);
            }
        }

        if (leftRacerTime < rightRacerTime) {
            System.out.printf("The winner is left with total time: %.1f", leftRacerTime);
        } else if (leftRacerTime > rightRacerTime){
            System.out.printf("The winner is right with total time: %.1f", rightRacerTime);
        }

    }
}
