import java.util.Random;

enum Color {
    YELLOW, RED, GREEN, BLUE
}

public class Circle {
    private double radius;
    private Color color;

    public Circle() {
        this.radius = 1.0;
        this.color = getRandomColor();
    }

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void makeMeMoon() {
        if (color != Color.YELLOW) {
            color = Color.YELLOW;
            System.out.println("Ready. Made the circle a moon.");
        } else {
            System.out.println("The circle is already a moon. Did nothing.");
        }
    }

    @Override
    public String toString() {
        return "Circle with radius " + String.format("%.2f", radius) +
                " and diameter " + String.format("%.2f", 2 * radius) +
                ".\nPerimeter: " + String.format("%.2f", getCircumference()) +
                "\nArea: " + String.format("%.2f", getArea()) +
                "\nColor: " + color;
    }

    private Color getRandomColor() {
        Color[] colors = Color.values();
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}

