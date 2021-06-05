package RegularExpressions_EX;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Pattern pattern = Pattern.compile(">>(\\w+)<<(\\d+\\.?\\d+)!(\\d+)");
        double totalMoneySpend = 0.00;
        if (!input.equals("Purchase")) {
            System.out.println("Bought furniture:");
        }

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()) {
                System.out.println(matcher.group(1));

                totalMoneySpend += Double.parseDouble(matcher.group(2)) * Double.parseDouble(matcher.group(3));
            }
            input = scan.nextLine();
        }

        System.out.printf("Total money spend: %.2f", totalMoneySpend);
    }
}
