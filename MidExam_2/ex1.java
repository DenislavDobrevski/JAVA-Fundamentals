package MidExam_2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double side = Double.parseDouble(scan.nextLine());
        int numberOfSheets = Integer.parseInt(scan.nextLine());
        double boxArea = side * side * 6;
        double totalAreaWrapped = 0.0;

        for (int i = 1; i <= numberOfSheets; i++) {
            double length = Double.parseDouble(scan.nextLine());
            double width = Double.parseDouble(scan.nextLine());
            double areaOfCurrentSheet = length * width;

            if (i % 3 == 0) {
                areaOfCurrentSheet *= 0.75;
            }
            if (i % 5 != 0) {
                totalAreaWrapped += areaOfCurrentSheet;
            }
        }


        if (totalAreaWrapped >= boxArea) {
            double wrapPaperLeft = 100.00 - (boxArea * 100.00) / totalAreaWrapped;
            System.out.println("You've covered the gift box!");
            System.out.printf("%.2f%% wrap paper left.", wrapPaperLeft);
        } else {
            double wrapPaperNeeded = 100.00 - (totalAreaWrapped * 100.00) / boxArea;
            System.out.println("You are out of paper!");
            System.out.printf("%.2f%% of the box is not covered.", wrapPaperNeeded);
        }

    }
}
