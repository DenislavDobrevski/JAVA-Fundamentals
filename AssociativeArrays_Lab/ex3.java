package AssociativeArrays_Lab;

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split(" ");

        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        for (String word : words) {
            String wordInLowerCase = word.toLowerCase();
            if (counts.containsKey(wordInLowerCase)) {
                counts.put(wordInLowerCase, counts.get(wordInLowerCase) + 1);
            } else {
                counts.put(wordInLowerCase, 1);
            }
        }

        List<String> oddOccurences = new ArrayList<>();


        for (var entry : counts.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddOccurences.add(entry.getKey());
            }
        }

        for (int i = 0; i < oddOccurences.size(); i++) {
            System.out.print(oddOccurences.get(i));
            if(i < oddOccurences.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
