class MyBook extends Book2 {
    public MyBook(String title, String author, double price) {
        super(title, author, "", 0, "", price);
    }

    @Override
    public void display() {
        System.out.println("Title: " + getTitle() + ". Author: " + getAuthor() + ". Price: " + getPrice() + ".");
    }
}