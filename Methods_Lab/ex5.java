package Methods_Lab;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        int amount = Integer.parseInt(scan.nextLine());
        totalPrice(product, amount);
    }

    public static void totalPrice(String product, int amount) {
        if (product.equals("coffee")) {
            System.out.printf("%.2f", amount * 1.50);
        } else if (product.equals("water")) {
            System.out.printf("%.2f", amount * 1.00);
        } else if (product.equals("coke")) {
            System.out.printf("%.2f", amount * 1.40);
        } else if (product.equals("snacks")) {
            System.out.printf("%.2f", amount * 2.00);
        }
    }

}
