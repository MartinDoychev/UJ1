/*Създайте клас Book който има абстрактен метод display()
Създайте клас MyBook който: 2.1 Наследява Book 2.2 
Има конструктор с параметри title, author, price 2.3 Имплементира display() т. че да той да извежда конзолата следният изход: Title: <title>. Author: <author>. Price: <price>.
Създайте клас BookTest който чете книги от конзолата (преценете кога да спре четенето) и след това извежда книгите в конзолата. */
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class BookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<MyBook> books = new ArrayList<>();

        while (true) {
            System.out.println("Enter book details or type 'exit' to finish:");
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Price: ");
            double price = Double.parseDouble(scanner.nextLine());

            MyBook myBook = new MyBook(title, author, price);
            books.add(myBook);
        }

        System.out.println("\nBook Catalogue:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i).toString());
        }

        scanner.close();
    }
}