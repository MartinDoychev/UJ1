/*В класа Student от задача Student направете следните промени:
Добавете метод void increaseAge(), който увеличава възрастта на ученика с 1 година.
Използвайте метод overloading, за да създадете метод void increaseAge(int years), който увеличава възрастта на ученика с years на брой години.
Добавете и метод goToNextClass(); (Внимавайте! Класовете не се увеличават до безкрай! В даден момент ученикът ще завърши)
В StudentTest класа демонстрирайте как работят методите, които добавихте. */
public class StudentTest2 {
    public static void main(String[] args) {
        Student2 student = new Student2("Ivanov", "Ivan", 20, "Class 10");
        System.out.println("Before: " + student.toString());
        student.increaseAge();
        System.out.println("After increasing age: " + student.toString());

        student.increaseAge(3);
        System.out.println("After increasing age with 3 years: " + student.toString());

        student.goToNextClass();
        System.out.println("After going to the next class: " + student.toString());
    }
}
