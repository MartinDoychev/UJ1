/*В задачата Shapes от предишното домашно, добавете класове Circle и Triangle с необходимите за тях атрибути т. че да е възможно смятането на лицето и периметъра им.
В ShapesTest class създайтe обекти от тип Shape които да са инстанции на Circle, Rectangle, Square, Triangle съответно.
Използвайте instanceof оператора за да направите следните проверки: 
Ако обектът е кръг тогава принтирайте “Кръг с радиус: Х” 
Ако обектът е правоъгълник тогава принтирайте “Правоъгълник с височина Х и широчина У” Ако обектът е квадрат тогава принтирайте “Квадрат” 
Ако обектът е триъгълник тогава принтирайте “Правоъгълен/Тъпоъгълен/Остроъгълен Триъгълник със страни a,b,c, и ъгли alpha, beta, gama.” (*Ако е правоъгълен не извеждайте и остроъгълен.)
Сега в Circle добавете и метод getDiameter() който изчислява диаметъра на кръга. 
В ShapesTest класа към изхода в случай на кръг добавете и диаметъра. т.е. Когато дадения обект е кръг тогава да се извежда “Кръг с радиус: Х и диаметър D”
В класът Rectangle добавете метод getMaxPossibleSquareInside() който ще връщат страната на най-големия възможен (т.е. с най-голяма страна) квадрат който се събира в правъгълника. 
Сега в ShapesTest в случая когато обектът е правоъгълник добавете в изхода и страната на най-големия възможен квадрат който се събира в правоъгълника. т.е. примерен изход: 
“Правоъгълник с височина Х и широчина У” . Страната на най-големия квадрат който се събира в правоъгълника е: “ */
public class ShapesTest {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(3, 4);
        Shape square = new Square(5);
        Shape triangle = new Triangle(3, 4, 5);

        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(square);
        printShapeInfo(triangle);
    }

    private static void printShapeInfo(Shape shape) {
        System.out.println("Shape Information:");

        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            System.out.println("Circle with radius: " + circle.getRadius() + " and diameter: " + circle.getDiameter());
        } 
        
        else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            System.out.println("Rectangle with height: " + rectangle.getHeight() + " and width: " + rectangle.getWidth() + ". Max square inside: " + rectangle.getMaxPossibleSquareInside());
        } 
        
        else if (shape instanceof Square) {
            System.out.println("Square");
        } 
        
        else if (shape instanceof Triangle) {
            Triangle triangle = (Triangle) shape;
            System.out.println("Triangle with sides: " + triangle.getSideA() + ", " + triangle.getSideB() + ", " + triangle.getSideC() + " and angles: alpha=" + triangle.getAlpha() +
                               ", beta=" + triangle.getBeta() + ", gamma=" + triangle.getGamma());
        }

        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println();
    }
}