package MidExam;

import java.util.*;
import java.util.stream.Collectors;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.sort(numbers, Collections.reverseOrder());

        double avr = 0;
        for (Integer number : numbers) {
            avr += number;
        }

        avr /= numbers.size();

        if (numbers.get(0) <= avr) {
            System.out.println("No");
        } else {
            for (int i = 0; i < 5; i++) {
                if (numbers.get(i) > avr) {
                    System.out.printf("%d ", numbers.get(i));
                } else {
                    break;
                }

            }
        }


    }
}
