package Methods_Lab;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String variableType = scan.nextLine();

        if (variableType.equals("int")) {
            int firstVariable = Integer.parseInt(scan.nextLine());
            int secondVariable = Integer.parseInt(scan.nextLine());
            System.out.println(getMax(firstVariable, secondVariable));
        } else if (variableType.equals("char")) {
            char firstVariable = scan.nextLine().charAt(0);
            char secondVariable = scan.nextLine().charAt(0);
            System.out.println(getMax(firstVariable, secondVariable));

        } else if (variableType.equals("string")) {
            String firstVariable = scan.nextLine();
            String secondVariable = scan.nextLine();
            System.out.println(getMax(firstVariable, secondVariable));
        }

    }

    public static int getMax(int firstVariable, int secondVariable) {
        if (firstVariable > secondVariable) {
            return firstVariable;
        } else {
            return secondVariable;
        }
    }

    public static char getMax(char firstVariable, char secondVariable) {
        if (firstVariable > secondVariable) {
            return firstVariable;
        } else {
            return secondVariable;
        }
    }

    public static String getMax(String firstVariable, String secondVariable) {
        if (firstVariable.compareTo(secondVariable) >= 0) {
            return firstVariable;
        } else  {
            return secondVariable;
        }
    }


}
