package AssociativeArrays_EX;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        String input = scan.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (input.charAt(i) != ' ') {
                if (!map.containsKey(letter)) {
                    map.put(letter, 1);
                } else {
                    map.put(letter, map.get(letter) + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> character : map.entrySet()) {
            System.out.printf("%c -> %d%n", character.getKey(), character.getValue());
        }
    }
}
