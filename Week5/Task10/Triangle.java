/* Създайте клас Triangle който има:
3 страни
3 ъгъла
Може да създава триъгълник по 2 страни и ъгълът между тях. (Тук ще трябва да използвате теореми от тригонометрията за да намерите останалите страни и ъгли. Посъветвайте се с Google. Жокер: ще ви трябва косинусова теорема, евентуално, зависи от вашия избор, намиране на някоя от височините, намиране на R, синусова теорема, фактът, че сборът на ъглите в един триъгълник е 180 градуса).
Може да смята периметъра на триъгълника.
Може да смята лицето на триъгълника.
Може да генерира String във всичките ъгли и страни на триъгълника.
Напишете TriangleTest клас, който чете две страни и ъгъла между тях от конзолата. (Не забравяйте да валидирате входните данни!)
Извежда в конзолата стойностите на трите страни на триъгълника, трите ъгъла, лицето и периметъра.*/
import java.util.Scanner;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    private double angle1;
    private double angle2;
    private double angle3;

    public Triangle(double side1, double side2, double angleBetween) {
        if (side1 <= 0 || side2 <= 0 || angleBetween <= 0 || angleBetween >= 178) {
            throw new IllegalArgumentException("Invalid input values for triangle sides and angles.");
        }

        this.side1 = side1;
        this.side2 = side2;
        this.angle1 = angleBetween;
        calculateRemainingSidesAndAngles();
    }

    private void calculateRemainingSidesAndAngles() {
        angle2 = 180 - angle1 - Math.toDegrees(Math.acos((side1 * Math.cos(Math.toRadians(angle1))) / side2));
        angle3 = 180 - angle1 - angle2;

        side3 = Math.sqrt(side1 * side1 + side2 * side2 - 2 * side1 * side2 * Math.cos(Math.toRadians(angle1)));
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", angle1=" + angle1 +
                ", angle2=" + angle2 +
                ", angle3=" + angle3 +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side 1:");
        double side1 = scanner.nextDouble();

        System.out.println("Enter side 2:");
        double side2 = scanner.nextDouble();

        System.out.println("Enter the angle between sides:");
        double angleBetween = scanner.nextDouble();

        try {
            Triangle triangle = new Triangle(side1, side2, angleBetween);

            System.out.println("Triangle information:");
            System.out.println("Sides: " + triangle.side1 + ", " + triangle.side2 + ", " + triangle.side3);
            System.out.println("Angles: " + triangle.angle1 + ", " + triangle.angle2 + ", " + triangle.angle3);
            System.out.println("Area: " + triangle.calculateArea());
            System.out.println("Perimeter: " + triangle.calculatePerimeter());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input values for triangle sides and angles. Please provide valid values.");
        }
    }
}
