import java.util.List;

class Car {
    private String brand;
    private String model;
    private String color;
    private Engine engine;
    private List<String> extras;

    public Car(String brand, String model, String color, Engine engine, List<String> extras) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.extras = extras;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public List<String> getExtras() {
        return extras;
    }

    public double calculatePrice() {
        double price = 20000;
        if (!extras.isEmpty()) {
            for (String extra : extras) {
                if ("climate".equals(extra)) {
                    price += 1500;
                } else if ("navigation".equals(extra)) {
                    price += 500;
                } else if ("cruiseControl".equals(extra)) {
                    price += 350;
                } else if ("automaticTransmission".equals(extra)) {
                    price += 3000;
                } else if ("powerWindows".equals(extra)) {
                    price += 250;
                }
            }
        }

        return price;
    }
}