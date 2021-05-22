import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        StringBuilder text = new StringBuilder(scan.nextLine());
        StringBuilder result = new StringBuilder();

        for (Integer number : numbers) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }

            while(sum >= text.length()){
                sum -= text.length();
            }

            result.append(String.valueOf(text.charAt(sum)));
            text.deleteCharAt(sum);
        }

        System.out.println(result);
    }
}
