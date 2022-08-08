package example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Enrollment cs3140 = new Enrollment();
        cs3140.addStudent("Jane", "Doe");
        cs3140.addStudent("John", "Smith");
        cs3140.addStudent("Abby", "Smith");
        cs3140.addStudent("Aaron", "Aaronson");
        cs3140.addStudent("Zoe", "Zoolander");

        cs3140.sortStudentsByName();
        List<Student> students = cs3140.getStudents();
        printStudentList(students);
    }

    private static void printStudentList(List<Student> students) {
        System.out.println("Student List:");
        for (Student s : students) {
            System.out.println("\t" + s);
        }
    }
}
