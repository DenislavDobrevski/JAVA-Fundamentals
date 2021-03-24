package ObjectsAndClasses_Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numbers = Integer.parseInt(scan.nextLine());
        BigInteger factorial = new BigInteger("1");
//        BigInteger numbers = new BigInteger(scan.nextLine());

        for (int i = 1; i < numbers; i++) {
            BigInteger secondNumber = new BigInteger(String.valueOf(i + 1));
            factorial = factorial.multiply(secondNumber);
        }

        System.out.println(factorial);

    }
}
