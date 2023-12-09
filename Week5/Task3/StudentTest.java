/*Създайте клас Student който има следните атрибути:
lastName
firstName
age
schoolClass
Добавете конструктор, който приема за аргумент всички атрибути.
Добавете get и set методи за всеки атрибут.
Напишете toString метод, който принтира всички атрибути, форматирани по ваш избор. (За форматирането е подходящо да се ползва StringBuilder)
Създайте клас StudentTest, в който се създават трима студенти, като инициализирате атрибути със стойности по ваш избор.
За всеки Student принтирайте неговите toString методи.
НЕ ЗАБРАВЯЙТЕ ДА ПОДРЕЖДАТЕ КЛАСОВЕТЕ В ПАКЕТИ. */
public class StudentTest {
    public static void main(String[] args) {
        Student1 student1 = new Student1("Ivanov", "Ivan", 20, "Class A");
        Student1 student2 = new Student1("Petrov", "Petar", 21, "Class B");
        Student1 student3 = new Student1("Georgiev", "Georgi", 19, "Class C");

        System.out.println("Student 1:\n" + student1.toString());
        System.out.println("Student 2:\n" + student2.toString());
        System.out.println("Student 3:\n" + student3.toString());
    }     
}

