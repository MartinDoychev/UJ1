/*В класа Student добавете и атрибут за среден успех.(2-6)
Променете и StudentTest така, че да се въвежда и средният успех за всеки ученик.
Покажете в конзолата всички отличници (с успех >= 5,50).
Покажете в конзолата всички двойкаджии.
Как имплементирахте горните две подточки?
Дали няма да е по-удобно, ако добавите методи isExcellent() и isVeryBad() в Student класа? Може да пробвате */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Ivanov", "Ivan", 20, "Class 10");

        System.out.println("Before: " + student.toString());
        student.increaseAge();
        System.out.println("After increasing age: " + student.toString());

        student.increaseAge(3);
        System.out.println("After increasing age with 3 years: " + student.toString());

        student.goToNextClass();
        System.out.println("After going to the next class: " + student.toString());
    }
}