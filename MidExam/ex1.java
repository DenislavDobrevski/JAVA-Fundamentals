package MidExam;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int emp1 = Integer.parseInt(scan.nextLine());
        int emp2 = Integer.parseInt(scan.nextLine());
        int emp3 = Integer.parseInt(scan.nextLine());
        int studentsCount = Integer.parseInt(scan.nextLine());

        int totalEmpEfficiency = emp1 + emp2 + emp3;

        int hoursNeeded = 0;

        while (studentsCount > 0) {

                studentsCount -= totalEmpEfficiency;
                hoursNeeded++;

                if(hoursNeeded % 4 == 0) {
                    hoursNeeded++;
                }

        }


        System.out.printf("Time needed: %dh.", hoursNeeded);
    }
}
