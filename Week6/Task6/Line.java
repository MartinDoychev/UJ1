public class Line {
    private double A;
    private double B;
    private double C;

    public Line() {
    }

    public Line(Point point1, Point point2) {
        this.A = point2.getY() - point1.getY();
        this.B = point1.getX() - point2.getX();
        this.C = point1.getX() * (point1.getY() - point2.getY()) + point1.getY() * (point2.getX() - point1.getX());
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }

    public double getC() {
        return C;
    }

    public void setC(double c) {
        C = c;
    }

    public boolean isPointOnLine(double x, double y) {
        return A * x + B * y + C == 0;
    }

    public boolean areParallel(Line otherLine) {
        return A * otherLine.getB() == B * otherLine.getA();
    }

    public boolean arePerpendicular(Line otherLine) {
        return A * otherLine.getA() + B * otherLine.getB() == 0;
    }

    public boolean doIntersect(Line otherLine) {
        return !areParallel(otherLine);
    }

    public double distanceToPoint(double x, double y) {
        return Math.abs(A * x + B * y + C) / Math.sqrt(A * A + B * B);
    }

    @Override
    public String toString() {
        return A + "x + " + B + "y + " + C + " = 0";
    }
}