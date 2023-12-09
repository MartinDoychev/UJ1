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
        double price = 20000; // Базова цена
    
        if (!extras.isEmpty()) {
            for (String extra : extras) {
                switch (extra) {
                    case "climate":
                        price += Extras.CLIMATE_PRICE;
                        break;
                    case "navigation":
                        price += Extras.NAVIGATION_PRICE;
                        break;
                    case "cruiseControl":
                        price += Extras.CRUISE_CONTROL_PRICE;
                        break;
                    case "automaticTransmission":
                        price += Extras.AUTOMATIC_TRANSMISSION_PRICE;
                        break;
                    case "powerWindows":
                        price += Extras.POWER_WINDOWS_PRICE;
                        break;
                }
            }
        }
    
        return price;
    }
    
}