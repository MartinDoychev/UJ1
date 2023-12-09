/*В задачата Animals от миналия път добавете класове Parrot, Pigeon, Seagull които наследяват Bird. 2. 
Променете както следва имплементацията на методa sing() във всеки един от наследните на Bird.
Parrot -> I am singing “How are you”
Pigeon -> I am singing “Gu Gu Gu”
Seagull -> I am singing “Kra Kra Kra”
Добавете и клас Mammal които има два child класа Cat и Dog.
Cat има метод meow(), а Dog – bark()
Създайте клас Petshop който има метод printCatalogue. 
Използвайте метод overloading за да направите две различни имплементации на printCatalogue.
4.1. printCatalogue() – извежда номерирано всички животни за които програмата знае
1. Birds:
 
  1.1. Pigeon
 
  1.2. Parrot
 
  1.3. Seagull
Mammal:
2.1. Dog
2.2. Cat
4.2. printCatalogue(AnimalType type) – извежда номериран каталог само за дадения тип (Mammal or Bird)
Сега потребителят трябва да си избере животно въвеждайки неговия номер. 
В зависимост от типа животно то може да пее, лае или прави мяу. 
Изведете в конзолота резултата от извикването на sing(), bark() или meow() методите за избраното животно. */
import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        printCatalogue();
        System.out.println("Enter the number of the animal you want:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.close();

        if (choice >= 1 && choice <= 3) {
            Bird bird = createBird(choice);
            bird.walk();
            bird.fly();
            bird.sing();
        } else if (choice >= 4 && choice <= 5) {
            Mammal mammal = createMammal(choice);
            mammal.walk();
            if (mammal instanceof Dog) {
                ((Dog) mammal).bark();
            } else if (mammal instanceof Cat) {
                ((Cat) mammal).meow();
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }

    private static void printCatalogue() {
        System.out.println("======= Petshop Catalogue =======");
        System.out.println("1. Birds:");
        System.out.println("   1. Pigeon");
        System.out.println("   2. Parrot");
        System.out.println("   3. Seagull");
        System.out.println("2. Mammals:");
        System.out.println("   4. Dog");
        System.out.println("   5. Cat");
    }

    private static Bird createBird(int choice) {
        switch (choice) {
            case 1:
                return new Pigeon();
            case 2:
                return new Parrot();
            case 3:
                return new Seagull();
            default:
                throw new IllegalArgumentException("Invalid bird choice.");
        }
    }

    private static Mammal createMammal(int choice) {
        switch (choice) {
            case 4:
                return new Dog();
            case 5:
                return new Cat();
            default:
                throw new IllegalArgumentException("Invalid mammal choice.");
        }
    }
}
