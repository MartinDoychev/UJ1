class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name, int legs) {
        super(legs);
        this.name = name;
    }

    public Cat() {
        super(4);
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }

    @Override
    public void walk() {
        displayLegs();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("I like playing with wool balls");
    }
}