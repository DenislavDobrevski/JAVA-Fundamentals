package Lists_EX;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());

        String[] input = scan.nextLine().split("\\s+");
        int bombNumber = Integer.parseInt(input[0]);
        int bombPower = Integer.parseInt(input[1]);

        while (numbers.contains(bombNumber)) {

            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) == bombNumber) {

                    for (int j = i + bombPower; j >= i - bombPower; j--) {
                        if(j > -1 && j < numbers.size()) {
                            numbers.remove(j);
                        }
                    }
                    i = -1;
                }
            }

        }

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        System.out.println(sum);
    }
}
