class Ford extends Car {
    private int year;
    private double manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, double manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }
}

