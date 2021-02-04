package AssociativeArrays_Lab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String result = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((l,r) -> r.compareTo(l))
                .limit(3)
                .map(Object::toString)
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
