package MidExam;

import java.util.Scanner;

public class ex1EX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());
        double groupNumber = Double.parseDouble(scan.nextLine());
        double priceForFuelPerKM = Double.parseDouble(scan.nextLine());
        double foodExpensesPerDay = Double.parseDouble(scan.nextLine());
        double priceForRoomPerNight = Double.parseDouble(scan.nextLine());


        boolean flag = true;

        if (groupNumber > 10) {
            priceForRoomPerNight *= 0.75;
        }

        double currentExpenses = ((groupNumber * foodExpensesPerDay)
                + (groupNumber * priceForRoomPerNight)) * days;

        for (int i = 1; i <= days; i++) {
            double distancePerDay = Double.parseDouble(scan.nextLine());


            currentExpenses = currentExpenses + (distancePerDay * priceForFuelPerKM);

            if (i % 3 == 0 || i % 5 == 0) {
                currentExpenses += currentExpenses * 0.4;
            }
            if (i % 7 == 0) {
                currentExpenses = currentExpenses - (currentExpenses / groupNumber);
            }

            if (budget < currentExpenses) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.printf("You have reached the destination. You have %.2f$ budget left.", (budget - currentExpenses));
        } else {
            System.out.printf("Not enough money to continue the trip. You need %.2f$ more.", (currentExpenses - budget));
        }
    }
}
