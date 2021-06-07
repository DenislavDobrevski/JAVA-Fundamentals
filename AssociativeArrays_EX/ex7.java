package AssociativeArrays_EX;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, List<Double>> students = new LinkedHashMap<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());
            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }

        students.entrySet().stream()
                .filter(e -> {
                    return e.getValue().stream()
                            .mapToDouble(d -> d)
                            .average()
                            .orElse(0.d) >= 4.5d;
                })
                .sorted((e1, e2) -> {
                    return Double.compare(e2.getValue().stream()
                            .mapToDouble(d -> d)
                            .average()
                            .orElse(0.d),
                            e1.getValue().stream()
                                    .mapToDouble(d -> d)
                                    .average()
                                    .orElse(0.d));
                })
                .forEach(e ->
                        System.out.printf("%s -> %.2f\n",
                                e.getKey(), e.getValue().stream().mapToDouble(d -> d).average().orElse(0d)));



    }
}
