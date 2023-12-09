class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }

    @Override
    void setWidth(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    void setHeight(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public String toString() {
        return String.format("Square with height: %.1f and width: %.1f. Max square inside: %.1f",
                getHeight(), getWidth(), getMaxPossibleSquareInside());
    }

    @Override
    double calculateArea() {
        return getHeight() * getHeight();
    }

    @Override
    double calculatePerimeter() {
        return 4 * getHeight();
    }
}
