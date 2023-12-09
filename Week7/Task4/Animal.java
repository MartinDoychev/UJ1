abstract class Animal {
    protected int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    abstract void eat();
    abstract void play();
    abstract void walk();

    protected void displayLegs() {
        System.out.println("I am walking by moving my " + legs + " legs.");
    }
}