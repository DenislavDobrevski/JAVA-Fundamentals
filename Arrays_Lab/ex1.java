package Arrays_Lab;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int day = Integer.parseInt(scan.nextLine());

        String[] weekDays = new String[8];
        weekDays[1] = "Monday";
        weekDays[2] = "Tuesday";
        weekDays[3] = "Wednesday";
        weekDays[4] = "Thursday";
        weekDays[5] = "Friday";
        weekDays[6] = "Saturday";
        weekDays[7] = "Sunday";
        weekDays[0] = "Invalid day!";

        System.out.println(weekDays[day]);
    }
}
