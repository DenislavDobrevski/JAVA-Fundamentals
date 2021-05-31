package Text_Processing_EX;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scan.nextLine());

        for (int i = 0; i < sb.length() - 1; i++) {
            char currentChar = sb.charAt(i);
            int counter = 0;
            if (currentChar == '>') {
                String bombPowerConverter = "" + sb.charAt(i + 1);
                int bombPower = Integer.parseInt(bombPowerConverter);

                for (int j = i + 1; j < i + bombPower; j++) {
                    if(j >= sb.length() - 2) {
                        break;
                    }
                    if (sb.charAt(j) == '>') {
                        bombPowerConverter = "" + sb.charAt(j + 1);
                        bombPower += Integer.parseInt(bombPowerConverter);
                        counter++;
                    } else {
                        sb.deleteCharAt(j);
                        j--;
                    }
                }
            i += counter;

            }
        }

        System.out.println(sb);
    }
}
