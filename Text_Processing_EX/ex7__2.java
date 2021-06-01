package Text_Processing_EX;

import java.util.Scanner;

public class ex7__2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scan.nextLine());
        StringBuilder result = new StringBuilder();
        int bombPower = 0;

        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == '>'){
                bombPower += Integer.parseInt(String.valueOf(sb.charAt(i+1)));
                result.append(sb.charAt(i));
            } else if(bombPower == 0){
                result.append(sb.charAt(i));
            } else {
                bombPower--;
            }
        }

        System.out.println(result);


    }
}
