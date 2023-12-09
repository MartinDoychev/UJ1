/*Създайте интерфейс Movable който има следните методи: – moveUp() – moveDown() – moveLeft() – moveRight() 
Нека клас MovablePoint имплементира интерфейса Movable, има toString() метод , както и следните атрибути: 
– x, y, xSpeed, ySpeed и имплементира методите на Movable както следва – moveUp() -> y-=ySpeed – moveDown()
 -> y+=ySpeed – moveLeft() -> x-=xSpeed – moveRight() -> x+=xSpeed 
 Създайте и клас Circle който също имплементира Movable и има следните атрибути – radius – 
 MovablePoint center Добавете клас MovableRectangle който има атрибути topLeft и bottomRight които са от тип MovablePoint */
public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1, 2, 3, 4);
        Circle circle = new Circle(0, 0, 1, 1, 5);
        MovableRectangle rectangle = new MovableRectangle(0, 0, 2, 3, 1, 1);

        System.out.println("Initial positions:");
        System.out.println("Point: " + point);
        System.out.println("Circle: " + circle);
        System.out.println("Rectangle: " + rectangle);

        point.moveUp();
        circle.moveRight();
        rectangle.moveDown();

        System.out.println("\nPositions after movement:");
        System.out.println("Point: " + point);
        System.out.println("Circle: " + circle);
        System.out.println("Rectangle: " + rectangle);
    }
}