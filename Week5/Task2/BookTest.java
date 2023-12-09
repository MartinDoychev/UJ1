/*Копирайте класа Book от предишната задача и направете следните промени в него:
Добавете конструктор, който инициализира атрибутите.
Добавете toString() метод който връща String, съдържащ атрибутите на класа, подходящо форматирани.
Добавете и една статична константа която ще представлява брояч на книги. Копирайте BookTest класа като направите следните промени в него:
Принтирайте меню на потребителя, където той може да избере 1. Да въведе книга или 2. Изход
Книгите да се въвеждат от конзолата като използвате Scanner. (Валидирайте входните данни, за да избегнете грешки във вашата програма)
При въвеждането на всяка книга тогава стойността на брояча се увеличава с 1.
Когато потребителят избере Изход тогава в конзолата се отпечатва броя на всички книги и toString-а на всяка една от тях. */
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Enter a book");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.next();
                    System.out.print("Enter author: ");
                    String author = scanner.next();
                    System.out.print("Enter ISBN: ");
                    String ISBN = scanner.next();
                    System.out.print("Enter pages: ");
                    int pages = scanner.nextInt();
                    System.out.print("Enter publisher: ");
                    String publisher = scanner.next();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();

                    Book newBook = new Book(title, author, ISBN, pages, publisher, price);
                    System.out.println("Book added successfully!\n");
                    break;
                case 2:
                    System.out.println("Number of books: " + Book.getBookCount());
                    break;
                default:
                    System.out.println("Invalid choice. Try again.\n");
            }
        } while (choice != 2);

        scanner.close();
    }
}