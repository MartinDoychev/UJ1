class Car {
    String brand;
    String model;
    String bodyType;
    String color;
    double length;
    double width;
    double weight;
    String engineType;
    double price;
    boolean hasExtras;

    // Конструктор
    public Car(String brand, String model, String bodyType, String color, double length, double width, double weight, String engineType, double price, boolean hasExtras) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.color = color;
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.engineType = engineType;
        this.price = price;
        this.hasExtras = hasExtras;
    }

    // Принтиране на информацията за колата
    public void printCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Body Type: " + bodyType);
        System.out.println("Color: " + color);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Weight: " + weight);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Price: " + price);
        if (hasExtras) {
            System.out.println("This car is equipped with extras.");
        } else {
            System.out.println("This car is not equipped with any extras.");
        }
        System.out.println();
    }
}