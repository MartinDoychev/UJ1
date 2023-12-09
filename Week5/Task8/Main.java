/*Създайте клас Circle, който има зададен радиус и цвят от тип enum Color с цветовете жълт, зелен, син, червен.
Класът има default constructor, където за радиус се задава стойност 1.0, а цветът се избира случайно измежду възможните.
Класът имa конструктор, който получава радиус и цвят като аргументи и ги инициализира.
Добавете Getters and Setters
Добавете метод getArea() – смята лицето на кръга
Добавете метод getCircumference – смята обиколката на кръга
Добавете метод makeMeMoon() – оцветява кръга в жълто
Добавете метод toString() – създава следния текст:
“Кръг с радиус <СТОЙНОСТ> и диаметър <СТОЙНОСТ>.
Периметър: <СТОЙНОСТ>
Лице: <СТОЙНОСТ>
Цвят: <СТОЙНОСТ>
Съдайте клас Main, който при стартиране показва:
Принтира “Въведете дължина на радиус или 0 за радиус по подразбиране [1.0]:” и чака вход
Принтира “Изберете цвят (1 за жълт, 2 за червен, 3 за зелен, 4 за син)]:” и чака вход
Принтира в конзолата следния текст: “Създаден е червен кръг с радиус 3,00, и диаметър 6,00”
Принтира в конзолата следния текст: “Изберете опция: 1. Периметър 2. Лице 3. Луна ли е? 4. Направи кръга луна 5. Принтирай toString”
И показва следните резултати за различните опции: За опция 1 -> Периметърът на кръга е <СТОЙНОСТ> За опция 2 -> Лицето на кръга е <СТОЙНОСТ> За опция 3 -> Ако кръгът не е жълт: Кръгът не е луна , Ако кръгът е жълт: Кръгът е луна. За опция 4. -> Ако кръгът не е жълт: прави му цвета жълт и показва “Готов. Направих кръга на луна”; Ако кръгът е жълт, показва “Кръгът вече е луна. Няма да правя нищо.” За опция 5. -> “Кръг с радиус <СТОЙНОСТ> и диаметър <СТОЙНОСТ>. Периметър: <СТОЙНОСТ> Лице: <СТОЙНОСТ> Цвят: <СТОЙНОСТ>” */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius length or 0 for default radius [1.0]: ");
        double radius = scanner.nextDouble();
        System.out.println("Choose color (1 for yellow, 2 for red, 3 for green, 4 for blue): ");
        int colorChoice = scanner.nextInt();

        Circle circle = new Circle(radius, getColorByChoice(colorChoice));

        System.out.println("Created a " + circle.getColor() + " circle with radius " + circle.getRadius() + " and diameter " + 2 * circle.getRadius());

        while (true) {
            System.out.println("Choose option:");
            System.out.println("1. Perimeter");
            System.out.println("2. Area");
            System.out.println("3. Is it a moon?");
            System.out.println("4. Make it a moon");
            System.out.println("5. Print toString");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Perimeter of the circle is " + circle.getCircumference());
                    break;
                case 2:
                    System.out.println("Area of the circle is " + circle.getArea());
                    break;
                case 3:
                    if (circle.getColor() != Color.YELLOW) {
                        System.out.println("The circle is not a moon.");
                    } else {
                        System.out.println("The circle is a moon.");
                    }
                    break;
                case 4:
                    circle.makeMeMoon();
                    break;
                case 5:
                    System.out.println(circle.toString());
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }

    private static Color getColorByChoice(int choice) {
        switch (choice) {
            case 1:
                return Color.YELLOW;
            case 2:
                return Color.RED;
            case 3:
                return Color.GREEN;
            case 4:
                return Color.BLUE;
            default:
                return Color.YELLOW;
        }
    }
}