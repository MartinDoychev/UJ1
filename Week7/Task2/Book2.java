class Book2 {
    private String title;
    private String author;
    private String ISBN;
    private int pages;
    private String publisher;
    private double price;

    private static int bookCount = 0;

    public Book2(String title, String author, String ISBN, int pages, String publisher, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.pages = pages;
        this.publisher = publisher;
        this.price = price;

        bookCount++;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void display() {
        
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPrice: $" + price + "\n";
    }

    public static int getBookCount() {
        return bookCount;
    }
}