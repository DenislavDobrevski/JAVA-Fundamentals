package Lists_EX;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());

        int i = 0;
        int j = 0;
        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty()) {
//            if(i >= firstPlayer.size()) {
//                i = 0;
//            }
//            if(j >= secondPlayer.size()) {
//                j = 0;
//            }

            if (firstPlayer.get(0) > secondPlayer.get(0)) {
                int temp = firstPlayer.get(0);
                firstPlayer.add(temp);
                firstPlayer.add(secondPlayer.get(0));
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            } else if (firstPlayer.get(0) < secondPlayer.get(0)) {
                int temp = secondPlayer.get(0);
                secondPlayer.add(temp);
                secondPlayer.add(firstPlayer.get(0));
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            } else {
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            }
        }

        int sum = 0;
        if (!firstPlayer.isEmpty()) {
            for (int card : firstPlayer) {
                sum += card;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            for (int card : secondPlayer) {
                sum += card;
            }
            System.out.printf("Second player wins! Sum: %d", sum);

        }
    }
}
