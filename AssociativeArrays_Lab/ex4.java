package AssociativeArrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Arrays.stream(scan.nextLine().split(" "))
                .filter(n -> n.length() % 2 == 0)
                .forEach(n -> System.out.println(n));
    }
}
