package Text_Processing_EX;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] inputNum = scan.nextLine().toCharArray();
        int multiplier = Integer.parseInt(scan.nextLine());

        StringBuilder exitNum = new StringBuilder();

        int addNum = 0;
        for (int i = inputNum.length - 1; i >= 0; i--) {
            int currentNum = ((inputNum[i] - '0') * multiplier) + addNum;
            exitNum.append(currentNum % 10);
            addNum = currentNum / 10;
        }

        exitNum.append(addNum);


        exitNum.reverse();
        while (exitNum.charAt(0) == '0' && exitNum.length() > 1) {
            exitNum.deleteCharAt(0);
        }
        for (int i = 0; i < exitNum.length(); i++) {
            System.out.print(exitNum.charAt(i));
        }

    }
}
