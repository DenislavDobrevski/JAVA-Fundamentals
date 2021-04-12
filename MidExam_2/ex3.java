package MidExam_2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> deck = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(", ");
            switch (input[0]) {
                case "Add":
                    String cardName = input[1];
                    if(deck.contains(cardName)){
                        System.out.println("Card is already in the deck");
                    } else {
                        deck.add(cardName);
                        System.out.println("Card successfully added");
                    }
                    break;
                case "Remove":
                    cardName = input[1];
                    if(!deck.contains(cardName)){
                        System.out.println("Card not found");
                    } else {
                        deck.remove(cardName);
                        System.out.println("Card successfully removed");
                    }
                    break;
                case "Remove At":
                    int index = Integer.parseInt(input[1]);
                    if(index >= 0 && index < deck.size()){
                        deck.remove(index);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
                case "Insert":
                    index = Integer.parseInt(input[1]);
                    cardName = input[2];
                    if(index >= 0 && index < deck.size()){
                        if(deck.contains(cardName)){
                            System.out.println("Card is already added");
                        }else{
                        deck.add(index, cardName);
                        System.out.println("Card successfully added");
                        }
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
            }
        }

        System.out.println(deck.toString().replaceAll("[\\[\\]]", ""));

    }
}
