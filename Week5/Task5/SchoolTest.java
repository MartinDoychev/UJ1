/*Създайте клас School, който има име, списък от класове, списък от ученици.
Добавете в класа Student от предишната задача константа, която ще държи броя на учениците.
Създайте класа SchoolTest, в който ще се въвеждат от конзолата ученици.
Когато приключи въвеждането (Вие преценете как да стане това. Може да ползвате същия начин като предишните задачи или нещо друго.), изведете в конзолата общия брой въведени ученици и toString-a на всеки от тях.
Сега изведете всички, които ще са абитуриенти.
Извикайте goToNextClass() метода на всеки един от бъдещите абитуриенти. Нека той да принтира “Йееейй! Завърших!”
Сега изведете в конзолата общия брой ученици (Той променен ли е? Ако не е – оправете този бъг!) */
import java.util.Scanner;

public class SchoolTest {
    public static void main(String[] args) {
        School school = new School("My School");
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = 2;

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Last Name: ");
            String lastName = scanner.next();
            System.out.print("First Name: ");
            String firstName = scanner.next();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("School Class: ");
            String schoolClass = scanner.next();

            Student4 student = new Student4(lastName, firstName, age, schoolClass);
            school.addStudent(student);
        }
        scanner.close();

        System.out.println("\nTotal number of students: " + Student4.getNumberOfStudents());

        System.out.println("\nAll Students:");
        for (Student4 student : school.getStudents()) {
            System.out.println(student.toString());
        }

        System.out.println("\nFuture Graduates:");
        for (Student4 student : school.getStudents()) {
            if (student.getSchoolClass().equals("Class 12")) {
                System.out.println(student.toString());
                student.goToNextClass();
            }
        }

        System.out.println("\nTotal number of students after graduation: " + Student4.getNumberOfStudents());
        System.out.println("Total number of classes: " + school.getNumberOfClasses());
    }
}