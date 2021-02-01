package AssociativeArrays_Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] nums = Arrays.stream(scan.nextLine().split(" "))
                .mapToDouble(n -> Double.parseDouble(n))
                .toArray();

        TreeMap<Double, Integer> counts = new TreeMap<>();

        for (double num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 0);
            }
            counts.put(num, counts.get(num) + 1);

        }

        DecimalFormat df = new DecimalFormat("#.#######");
        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            System.out.printf("%.0f -> %d%n", Double.parseDouble(df.format(entry.getKey())), entry.getValue());
        }


    }
}
