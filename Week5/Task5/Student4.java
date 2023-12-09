public class Student4 {
    private static int numberOfStudents = 0;
    private String lastName;
    private String firstName;
    private int age;
    private String schoolClass;

    public Student4(String lastName, String firstName, int age, String schoolClass) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.schoolClass = schoolClass;
        numberOfStudents++;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getSchoolClass() {
        return schoolClass;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Last Name: ").append(lastName).append("\n");
        sb.append("First Name: ").append(firstName).append("\n");
        sb.append("Age: ").append(age).append("\n");
        sb.append("School Class: ").append(schoolClass).append("\n");
        return sb.toString();
    }

    public void increaseAge() {
        age++;
    }

    public void increaseAge(int years) {
        age += years;
    }

    public void goToNextClass() {
        if (schoolClass.equals("Class 12")) {
            System.out.println("The student has graduated!");
            numberOfStudents--;  // Намаляваме броя на учениците след градуация
        } 
        
        else {
            int currentClass = Integer.parseInt(schoolClass.split(" ")[1]);
            currentClass++;
            schoolClass = "Class " + currentClass;
            System.out.println("The student is now in " + schoolClass);
        }
    }
}