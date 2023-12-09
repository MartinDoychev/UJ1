class Spider extends Animal {
    public Spider() {
        super(8);
    }

    @Override
    void eat() {
        System.out.println("Spider is eating.");
    }

     @Override
    void play() {
        
    }

    @Override
    void walk() {
        displayLegs();
    }
}