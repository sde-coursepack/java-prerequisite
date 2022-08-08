package example;

public class Student implements Comparable<Student> {
    private final int idNumber;
    private String firstName, lastName;
    private String email;

    public static final String EMAIL_DOMAIN = "virginia.edu";

    public Student(int idNumber, String firstName, String lastName) {
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("Students names cannot be null when instantiated");
        }
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = generateEmail();
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "example.Student{" +
                "idNumber=" + idNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        //sort students in ascending order by id number
        return idNumber - other.idNumber;
    }

    private String generateEmail() {
        char firstLetterFirstName = firstName.charAt(0);
        return firstLetterFirstName + lastName + "@" + EMAIL_DOMAIN;
    }
}
