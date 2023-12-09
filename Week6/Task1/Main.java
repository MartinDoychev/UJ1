/*Даден е клас Animal с метод void walk(){ System.out.println(“I am walking”); }
Клас Bird който наследява Animal и има метод fly() със следното тяло System.out.println(“I am flying”);
Напишете клас Main.java – създава Bird, вика bird.walk(), bird.fly()
Добавете sing() метод в Bird класа т. че програмата да принтира следния изход: I am walking
I am flying
I am singing */
public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
