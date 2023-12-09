class Truck extends Car {
    private double weight;

    public Truck(int speed, double regularPrice, String color, double weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 0.9;
        } else {
            return regularPrice * 0.8;
        }
    }
}