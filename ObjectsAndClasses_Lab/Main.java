package ObjectsAndClasses_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        String[] input = scan.nextLine().split(" ");

        while (!input[0].equals("end")) {

            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            String homeTown = input[3];

            if (isStudentExisting(students, firstName, lastName)) {
                Student student = getStudent(students, firstName, lastName);

                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHomeTown(homeTown);
            } else {
                Student student = new Student(firstName, lastName, age, homeTown);
                students.add(student);
            }


            input = scan.nextLine().split(" ");
        }

        String currentCity = scan.nextLine();

        for (Student student : students) {
            if (student.getHomeTown().equals(currentCity)) {
                System.out.printf("%s %s is %d years old\n", student.getFirstName(),
                        student.getLastName(), student.getAge());
            }
        }

    }

    private static boolean isStudentExisting(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;

        for (Student student : students) {
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }

}
