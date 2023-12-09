/*Създайте клас Book който има следните атрибути:
Title
Author
ISBN
Pages
Publisher
Price
Добавете Getters and Setter за всички атрибути.
Създайте BookTest клас.
В main метода създайте инстанция на клас Book (използвайки конструктора по подразбиране)
Принтирайте всеки един от атрибутите в конзолата. (Забележете стойностите им по подразбиране!!!)
Задайте стойности по ваш избор на всеки атрибут, използвайки неговия setter.
Принтирайте пак всички атрибути. 
(Може да използвате статичен метод public static printAttributes(Book book), който да преизползвате всеки път като принтирате атрибутите) */
public class Test {
        public static void main(String[] args) {
            Book1 book = new Book1();
    
            System.out.println("Attributes before setting values:");
            Book1.printAttributes(book);
    
            book.setTitle("Java Programming");
            book.setAuthor("John Doe");
            book.setISBN("1234567890");
            book.setPages(300);
            book.setPublisher("Publisher ABC");
            book.setPrice(29.99);
    
            System.out.println("Attributes after setting values:");
            Book1.printAttributes(book);
        }
    }
