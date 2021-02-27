package Methods_Lab;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double width = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        double area = getRectangleArea(width, height);
        System.out.printf("%.0f", area);
    }

    public static double getRectangleArea(double width, double height) {
        return width * height;
    }
}
