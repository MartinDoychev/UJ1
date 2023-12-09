class Engine {
    private String model;
    private int power;
    private double volume;
    private String type;

    public Engine(String model, int power, double volume, String type) {
        this.model = model;
        this.power = power;
        this.volume = volume;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public double getVolume() {
        return volume;
    }

    public String getType() {
        return type;
    }
}
