package Methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number = Double.parseDouble(scan.nextLine());
        int raisedPower = Integer.parseInt(scan.nextLine());

        System.out.println(new DecimalFormat("0.####").format(poweredNumber(number, raisedPower)));
    }

    public static double poweredNumber(double number, int power) {
        double result = Math.pow(number, power);

        return result;
    }

    }

