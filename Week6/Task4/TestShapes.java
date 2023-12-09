/*Създайте клас Shape, който дефинира следните методи – getArea(), getPerimeter(), които връщат 0.
Създайте клас Rectangle, който наследява Shape и има атрибути width, height, конструктор, който приема width & height параметри, има getter & setter методи.
Направете клас Square, който наследява Rectangle. Помислете какъв конструктор ще има този клас.
Направете програма TestShapes, която илюстрира използването им и правилната работа на getArea() и getPerimeter() методите. */
public class TestShapes {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 7);
        Square square = new Square(4);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
    }
}