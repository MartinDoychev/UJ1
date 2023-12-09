/*Напишете interface GeometricObject с абстрактни методи – getArea() – getPerimeter() 
Напишете класове Circle – с атрибут radius – методи toString, getArea(), getPerimeter() Rectangle който го имплементират – 
с атрибути width, length – методи toString, getArea(), getPerimeter() 
Напишете програма която създава два обекта от тип GeometricObject. Единия да е Circle, а другия Rectangle. 
Вие си избирете стойности на които да инициализирате атрибутите им. Изведете в конзолата areа и perimeter на двата обекта. – 
Сега добавете и интерфейс Resizable който има абстрактен метод resize(int percent). – Добавете клас ResizableCircle който наследява Circle и имплементира Resizable. 
Нека имплементацията на метода resize да увеличава радиуса с percent. Демонтстрирайте работата на тази функционалност в main метода. */
public class Test {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(5);
        GeometricObject rectangle = new Rectangle(4, 6);

        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println();

        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        ResizableCircle resizableCircle = new ResizableCircle(3);

        System.out.println("Before Resize: " + resizableCircle.toString());
        System.out.println("Area: " + resizableCircle.getArea());
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());

        resizableCircle.resize(20);

        System.out.println("After Resize: " + resizableCircle.toString());
        System.out.println("Area: " + resizableCircle.getArea());
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
    }
}
