class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getWidth() {
        return width;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    @Override
    double calculateArea() {
        return getHeight() * getWidth();
    }
    
    @Override
    double calculatePerimeter() {
        return 2 * (getHeight() + getWidth());
    }

    public double getMaxPossibleSquareInside() {
        return Math.min(height, width);
    }

    @Override
    public String toString() {
        return String.format("Rectangle with height: %.1f and width: %.1f. Max square inside: %.1f",
                getHeight(), getWidth(), getMaxPossibleSquareInside());
    }

}