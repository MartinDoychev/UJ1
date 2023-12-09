/*Създайте абстрактен клас Shape с методи getArea() и getPerimeter().
Създайте класове Circle и Square които наследяват Shape и имплементират абстрактните му методи.
Създайте ShapeTest клас който инициализира един Circlе и един Square и извежда в конзолата техните лица и периметър. */
public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);

        System.out.println("Circle - Area: " + circle.getArea() + ", Perimeter: " + circle.getPerimeter());
        System.out.println("Square - Area: " + square.getArea() + ", Perimeter: " + square.getPerimeter());
    }
}