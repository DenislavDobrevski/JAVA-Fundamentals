package Text_Processing_EX;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        String first = input[0];
        String second = input[1];

        System.out.println(stringMultiplier(first, second));
    }

    private static int stringMultiplier(String first, String second) {
        int result = 0;
        if(first.length() > second.length()){
            for (int i = 0; i < second.length(); i++) {
                result += first.charAt(i) * second.charAt(i);
            }
            for (int i = first.length() - 1; i >= second.length() ; i--) {
                result += first.charAt(i);
            }
        } else if(first.length() < second.length()) {
            for (int i = 0; i < first.length(); i++) {
                result += second.charAt(i) * first.charAt(i);
            }
            for (int i = second.length() - 1; i >= first.length(); i--) {
                result += second.charAt(i);
            }
        }else {
            for (int i = 0; i < first.length(); i++) {
                result += second.charAt(i) * first.charAt(i);
            }
        }


        return result;
    }
}
