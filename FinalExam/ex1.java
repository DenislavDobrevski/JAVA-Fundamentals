package FinalExam;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        StringBuilder allStops = new StringBuilder(scan.nextLine());
        String[] tokens = scan.nextLine().split( ":");

        while (!tokens[0].equals("Travel")) {

            switch (tokens[0]) {
                case "Add Stop":
                    int index = Integer.parseInt(tokens[1]);
                    String replacement = tokens[2];
                    if(isValidIndex(allStops, index)) {
                        allStops.insert(index, replacement);
                    }
                    break;
                case "Remove Stop":
                    int startingIndex =  Integer.parseInt(tokens[1]);
                    int endingIndex =  Integer.parseInt(tokens[2]);
                    if(isValidIndex(allStops, startingIndex) && isValidIndex(allStops, endingIndex)) {
                        allStops.replace(startingIndex, endingIndex + 1, "");
                    }
                    break;
                case "Switch":
                    String oldStop = tokens[1];
                    String newStop = tokens[2];


                    allStops = new StringBuilder(allStops.toString().replace(oldStop, newStop));
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
            System.out.println(allStops);
            tokens = scan.nextLine().split( ":");


        }

        System.out.printf("Ready for world tour! Planned stops: %s", allStops);

    }

    static boolean isValidIndex (StringBuilder sb, int index) {
        return index >= 0 && index < sb.length();
    }
}


