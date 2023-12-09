/*Дефинирайте следните класове – Car и Demo с main метод.
Car -> Колата има марка, модел, тип каросерия, цвят, дължина, ширина, тегло, тип двигател (бензин, дизел, хибрид, електрически), цена и екстри (опционални).
Възможните екстри са -> Климатик, Автоматик, Навигация, Темпомат или Ел. стъкла.
Demo -> Прочетете число N, обозначаващо броя на колите, които трябва да произведете за деня. Всяка втора кола трябва да бъде оборудвана с поне 2 екстри, като ако има климатик, цената на колата трябва да се увеличи с 1500лв, Навигация – 500лв., Темпомат – 350лв., Автоматик – 3000лв. и ел. стъкла – 250лв.
След като завърши производството на колите, трябва да изкарате на конзолата следната статистика:
Брой произведени коли за деня
Обща стойност на произведените коли
Колко коли са произведени с екстри?
Колко коли са произведени с различните типове двигатели?
Принтирайте всички произведени коли с тяхната информация по реда на въвеждането им, като ако колата няма екстри, трябва да изписвате “This car is not equipped with any extras”. */
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cars to produce for the day: ");
        int numberOfCars = scanner.nextInt();

        int totalProducedCars = 0;
        double totalValueOfProducedCars = 0;
        int carsWithExtras = 0;
        int petrolCars = 0;
        int dieselCars = 0;
        int hybridCars = 0;
        int electricCars = 0;

        for (int i = 0; i < numberOfCars; i++) {
            System.out.println("Enter details for car " + (i + 1) + ":");

            System.out.print("Brand: ");
            String brand = scanner.next();
            System.out.print("Model: ");
            String model = scanner.next();
            System.out.print("Body Type: ");
            String bodyType = scanner.next();
            System.out.print("Color: ");
            String color = scanner.next();
            System.out.print("Length: ");
            double length = scanner.nextDouble();
            System.out.print("Width: ");
            double width = scanner.nextDouble();
            System.out.print("Weight: ");
            double weight = scanner.nextDouble();
            System.out.print("Engine Type (Petrol/Diesel/Hybrid/Electric): ");
            String engineType = scanner.next();
            System.out.print("Base Price: ");
            double basePrice = scanner.nextDouble();
            System.out.print("Does it have extras? (true/false): ");
            boolean hasExtras = scanner.nextBoolean();

            if (hasExtras) {
                System.out.println("Available Extras: ");
                System.out.println("1. Air Conditioning (1500 BGN)");
                System.out.println("2. Navigation (500 BGN)");
                System.out.println("3. Cruise Control (350 BGN)");
                System.out.println("4. Automatic Transmission (3000 BGN)");
                System.out.println("5. Electric Windows (250 BGN)");

                System.out.print("Enter the number of chosen extras: ");
                int chosenExtras = scanner.nextInt();

                switch (chosenExtras) {
                    case 1:
                        basePrice += 1500;
                        break;
                    case 2:
                        basePrice += 500;
                        break;
                    case 3:
                        basePrice += 350;
                        break;
                    case 4:
                        basePrice += 3000;
                        break;
                    case 5:
                        basePrice += 250;
                        break;
                    default:
                        System.out.println("Invalid choice. No extras added.");
                }
            }

            Car car = new Car(brand, model, bodyType, color, length, width, weight, engineType, basePrice, hasExtras);

            totalProducedCars++;
            totalValueOfProducedCars += car.price;
            if (hasExtras) {
                carsWithExtras++;
            }

            switch (engineType.toLowerCase()) {
                case "petrol":
                    petrolCars++;
                    break;
                case "diesel":
                    dieselCars++;
                    break;
                case "hybrid":
                    hybridCars++;
                    break;
                case "electric":
                    electricCars++;
                    break;
                default:
                    System.out.println("Invalid engine type.");
            }

            car.printCarInfo();
        }

        System.out.println("Production Statistics:");
        System.out.println("Total produced cars: " + totalProducedCars);
        System.out.println("Total value of produced cars: " + totalValueOfProducedCars + " BGN");
        System.out.println("Cars produced with extras: " + carsWithExtras);
        System.out.println("Petrol cars produced: " + petrolCars);
        System.out.println("Diesel cars produced: " + dieselCars);
        System.out.println("Hybrid cars produced: " + hybridCars);
        System.out.println("Electric cars produced: " + electricCars);
    }
}