class Fish extends Animal implements Pet {
    private String name;

    public Fish(String name) {
        super(0); 
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating.");
    }

    @Override
    public void walk() {
        System.out.println("Fish cannot walk.");
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
        System.out.println("I am playing on my own");
    }
}