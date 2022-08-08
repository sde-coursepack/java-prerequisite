package example;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int lastNameComparison = s1.getLastName().compareTo(s2.getLastName());
        if (lastNameComparison != 0) {
            return lastNameComparison;
        } else { //if last names are equal, compare first names
            return s1.getFirstName().compareTo(s2.getFirstName());
        }
    }
}
