import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private String ISBN;
    private int pages;
    private String publisher;
    private double price;

    private static int bookCount = 0;

    public Book(String title, String author, String ISBN, int pages, String publisher, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.pages = pages;
        this.publisher = publisher;
        this.price = price;

        bookCount++;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nISBN: " + ISBN +
                "\nPages: " + pages + "\nPublisher: " + publisher + "\nPrice: $" + price + "\n";
    }

    public static int getBookCount() {
        return bookCount;
    }
}


