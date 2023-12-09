/*Дефинирайте клас Point който е Java Bean.
Класът Point символизира точка в равнината с координати x, у.
Създайте клас Line който е Java Bean и симоволизира права в равнината. (Както е известно то математика всяка една права се определя от две точки. Използвайте този факт във вашата програма).
Използвайте уравнението на права в равнината g: Ax +By + C = 0.
Напишете програма която: * Чете от конзолата 2 точки които определят правата line1. * Чете от конзолата 2 точки които определят правата line2. * Помислите как да валидирате входните данни където има нужда т. че правата да има за дължина някаква положително число. * Показва взаимното положение на двете прави – пресичащи се, перпендикуларни, успоредни, съвпадащи. (Потърсете формулите за взаимно положение на две прави.) */
import java.util.Scanner;

public class TestLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coordinates of point 1 (x y): ");
        Point point1 = new Point(scanner.nextDouble(), scanner.nextDouble());

        System.out.print("Enter coordinates of point 2 (x y): ");
        Point point2 = new Point(scanner.nextDouble(), scanner.nextDouble());

        Line line1 = new Line(point1, point2);

        System.out.print("Enter coordinates of point 3 (x y): ");
        Point point3 = new Point(scanner.nextDouble(), scanner.nextDouble());

        System.out.print("Enter coordinates of point 4 (x y): ");
        Point point4 = new Point(scanner.nextDouble(), scanner.nextDouble());

        Line line2 = new Line(point3, point4);

        showLineRelation(line1, line2);
        scanner.close();
    }

    private static void showLineRelation(Line line1, Line line2) {
        System.out.println("Line 1: " + line1);
        System.out.println("Line 2: " + line2);

        if (line1.doIntersect(line2)) {
            System.out.println("The lines intersect.");
        } else {
            System.out.println("The lines do not intersect.");
        }

        if (line1.areParallel(line2)) {
            System.out.println("The lines are parallel.");
        }

        if (line1.arePerpendicular(line2)) {
            System.out.println("The lines are perpendicular.");
        }

        System.out.println("Distance between the lines: " + distanceBetweenLines(line1, line2));
    }

    private static double distanceBetweenLines(Line line1, Line line2) {
        if (line1.areParallel(line2)) {
            return Math.abs(line1.getC() - line2.getC()) / Math.sqrt(line1.getA() * line1.getA() + line1.getB() * line1.getB());
        }
        return 0.0;
    }
}
