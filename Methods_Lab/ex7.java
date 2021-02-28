package Methods_Lab;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String textInput = scan.nextLine();
        int repeatNumber = Integer.parseInt(scan.nextLine());

        String newString = repeatedString(textInput, repeatNumber);
        System.out.println(newString);
    }

    public static String repeatedString (String text, int repeatNUmber) {
        String newString =  text;
        for (int i = 1; i < repeatNUmber; i++) {
            newString = newString + text;
        }
        return newString;
    }


}
