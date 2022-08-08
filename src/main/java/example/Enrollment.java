package example;

import java.util.*;

public class Enrollment {
    private int nextStudentNumber;
    private List<Student> students;

    public Enrollment() {
        nextStudentNumber = 1;
        students = new ArrayList<>();
    }

    public void addStudent(String firstName, String lastName) {
        Student newStudent = generateStudent(firstName, lastName);
        students.add(newStudent);
    }

    public void sortStudentsByID() {
        Collections.sort(students);
    }

    public void sortStudentsByName() {
        Collections.sort(students, new StudentNameComparator());
    }

    public List<Student> getStudents() {
        return students;
    }

    private Student generateStudent(String firstName, String lastName) {
        Student student = new Student(nextStudentNumber, firstName, lastName);
        nextStudentNumber++;
        return student;
    }
}
