package AssociativeArrays_Lab;

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, List<String>> words = new LinkedHashMap<>();
        int numberOfInputs = Integer.parseInt(scan.nextLine());


        for (int i = 0; i < numberOfInputs; i++) {
            String word = scan.nextLine();
            String synonym = scan.nextLine();

//            if (!synonyms.containsKey(word)) {
//                synonyms.put(word, new ArrayList<String>());
//            }
                words.putIfAbsent(word, new ArrayList<String>());
                words.get(word).add(synonym);

        }

        for (Map.Entry<String, List<String>> entry : words.entrySet()) {
            System.out.println(entry.getKey() + " - "  + entry.getValue().toString().replaceAll("[\\]\\[]", ""));
    }
}
}
