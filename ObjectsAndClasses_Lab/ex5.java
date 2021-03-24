package ObjectsAndClasses_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        String[] input = scan.nextLine().split(" ");

        while (!input[0].equals("end")) {

//            String firstName = input[0];
//            String secondName = input[1];
//            int age = Integer.parseInt(input[2]);
//            String homeTown = input[3];

            Student student = new Student(input[0], input[1], Integer.parseInt(input[2]), input[3]);

//            student.getFirstName(input[0]);
//            student.getLastName(input[1]);
//            student.getAge(Integer.parseInt(input[2]));
//            student.getHomeTown(input[3]);

            students.add(student);

            input = scan.nextLine().split(" ");
        }

        String currentCity = scan.nextLine();

        for (Student student : students) {
            if (student.getHomeTown().equals(currentCity)) {
                System.out.printf("%s %s is %d years old\n", student.getFirstName(),
                        student.getLastName(), student.getAge() );
            }
        }

    }
}
