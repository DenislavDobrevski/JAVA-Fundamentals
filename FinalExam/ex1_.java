package FinalExam;

import java.util.Scanner;

public class ex1_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scan.nextLine());
        String[] input = scan.nextLine().split("\\s+");

        while (!input[0].equals("Finish")) {
            String command = input[0];
            switch (command) {
                case "Replace":
                    String currentChar = input[1];
                    String newChar = input[2];
                    String test = sb.toString().replaceAll(currentChar, newChar);
                    sb = new StringBuilder(test);
                    System.out.println(sb);
                    break;
                case "Cut":
                    int startInd = Integer.parseInt(input[1]);
                    int endInd = Integer.parseInt(input[2]);
                    if (startInd >= 0 && startInd < sb.length() && endInd > 0 && endInd < sb.length()) { //>=
                        sb.delete(startInd, endInd + 1);
                        System.out.println(sb);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                case "Make":
                    if (input[1].equals("Upper")) {
                        String temp = sb.toString().toUpperCase();
                        sb = new StringBuilder(temp);
                        System.out.println(sb);

                    } else if (input[1].equals("Lower")) {
                        String temp = sb.toString().toLowerCase();
                        sb = new StringBuilder(temp);
                        System.out.println(sb);
                    }
                    break;
                case "Check":
                    String temp = sb.toString();
                    if (temp.contains(input[1])) {
                        System.out.printf("Message contains %s%n", input[1]);
                    } else {
                        System.out.printf("Message doesn't contain %s%n", input[1]);
                    }
                    break;
                case "Sum":
                    int startInx = Integer.parseInt(input[1]);
                    int endInx = Integer.parseInt(input[2]);
                    int sum = 0;
                    if (startInx >= 0 && startInx < sb.length() && endInx > 0 && endInx < sb.length()) {
                        for (int i = startInx; i <= endInx; i++) {
                            sum += sb.charAt(i);
                        }
                        System.out.println(sum);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
            }


            input = scan.nextLine().split("\\s+");
        }


    }
}
