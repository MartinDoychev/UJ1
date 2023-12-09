class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }

    void sing() {
        System.out.println("I am singing");
    }
}

class Parrot extends Bird {
    @Override
    void sing() {
        System.out.println("I am singing \"How are you\"");
    }
}

class Pigeon extends Bird {
    @Override
    void sing() {
        System.out.println("I am singing \"Gu Gu Gu\"");
    }
}

class Seagull extends Bird {
    @Override
    void sing() {
        System.out.println("I am singing \"Kra Kra Kra\"");
    }
}