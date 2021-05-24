package Lists_EX;

import java.util.*;
import java.util.stream.Collectors;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\|");
        List<String> arrays = new ArrayList<>();
        for (int i = input.length - 1; i >= 0; i--) {
            arrays.add(input[i]);
        }
        String result = arrays.toString().replaceAll("[\\[\\],\\|]", "");
        result = result.trim().replaceAll("\\s+", " ");
//        result = result.trim();
        System.out.println(result);

    }
}
