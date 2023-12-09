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
}