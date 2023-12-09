/*Направете следните модификации в задачата “Фабрика за коли” от урок 8 в StartIT
Добавете класа Engine който да представлява двигателя на колата.
Двигателят има модел, мощност, обем и тип(дизел, бензин, хибридили електрическа).
Направете необходимите модификации в програмата т. че да удовлетворява следните условия:
Преди да започнете да произвеждате коли, трябва да произведете двигателите и да им зададете стойности на полетата – поне по 1 от всеки тип.
След това в класа трябва да прочетете число N, обозначаващо броят на колите, които трябва да произведете за деня.
Всяка втора кола, трябва да бъде оборудвана с поне 2 екстри, като ако има климатик цената на колата трябва да се увеличи с 1500лв, Навигация – 500лв., Темпомат – 350лв., Автоматик – 3000лв. и ел. стъкла – 250лв.
Всяка произведена кола трябва пазиреференция към своя двигател.
След като завърши производството на колите, трябва да изкарате на конзолата следната статистика: 
-Брой произведени коли за деня-Обща стойност на произведените коли 
-Колко коли са произведени с екстри? -Колко коли са произведени с различните типове двигатели? 
-Принтирайте всички произведени коли с тяхната информация по реда на въвеждането им, като ако колата няма екстри, трябва да изписвате “This car is not equipped with any extras” */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Engine dieselEngine = new Engine("Diesel Engine", 150, 2.0, "Дизел");
        Engine petrolEngine = new Engine("Petrol Engine", 200, 1.8, "Бензин");
        Engine hybridEngine = new Engine("Hybrid Engine", 180, 1.6, "Хибриден");
        Engine electricEngine = new Engine("Electric Engine", 250, 0.0, "Електрически");

        List<Car> cars = new ArrayList<>();

        System.out.println("Преди да започнете да произвеждате коли, трябва да произведете двигателите:");
        System.out.println("1. Diesel Engine");
        System.out.println("2. Petrol Engine");
        System.out.println("3. Hybrid Engine");
        System.out.println("4. Electric Engine");

        int engineChoice = scanner.nextInt();
        Engine firstEngine;

        switch (engineChoice) {
            case 1:
                firstEngine = dieselEngine;
                break;
            case 2:
                firstEngine = petrolEngine;
                break;
            case 3:
                firstEngine = hybridEngine;
                break;
            case 4:
                firstEngine = electricEngine;
                break;
            default:
                System.out.println("Invalid choice. Using default engine.");
                firstEngine = dieselEngine;
        }

        System.out.println("Сега въведете броят на колите, които трябва да произведете за деня:");
        int numberOfCars = scanner.nextInt();

        for (int i = 0; i < numberOfCars; i++) {
            System.out.println("Въведете детайлите на колата (марка, модел, цвят):");
            String brand = scanner.next();
            String model = scanner.next();
            String color = scanner.next();

            Engine selectedEngine = (i % 2 == 0) ? firstEngine : getRandomEngine();
            List<String> extras = (i % 2 == 1) ? getRandomExtras() : new ArrayList<>();

            Car car = new Car(brand, model, color, selectedEngine, extras);
            cars.add(car);
        }

        int totalCars = cars.size();
        int carsWithExtras = 0;
        int dieselCars = 0;
        int petrolCars = 0;
        int hybridCars = 0;
        int electricCars = 0;
        double totalValue = 0;

        for (Car car : cars) {
            if (!car.getExtras().isEmpty()) {
                carsWithExtras++;
            }

            if ("Дизел".equals(car.getEngine().getType())) {
                dieselCars++;
            } else if ("Бензин".equals(car.getEngine().getType())) {
                petrolCars++;
            } else if ("Хибриден".equals(car.getEngine().getType())) {
                hybridCars++;
            } else if ("Електрически".equals(car.getEngine().getType())) {
                electricCars++;
            }

            totalValue += car.calculatePrice();
        }

        System.out.println("\nСтатистика за произведените коли:");
        System.out.println("Брой произведени коли за деня: " + totalCars);
        System.out.println("Обща стойност на произведените коли: " + totalValue);
        System.out.println("Колко коли са произведени с екстри? " + carsWithExtras);
        System.out.println("Колко коли са произведени с различните типове двигатели?");
        System.out.println("Дизел: " + dieselCars);
        System.out.println("Бензин: " + petrolCars);
        System.out.println("Хибриден: " + hybridCars);
        System.out.println("Електрически: " + electricCars);

        System.out.println("\nДетайли за колите:");
        for (Car car : cars) {
            System.out.println("Марка: " + car.getBrand() + ", Модел: " + car.getModel() + ", Цвят: " + car.getColor()
                    + ", Двигател: " + car.getEngine().getModel() + ", Екстри: " + car.getExtras());
        }

        scanner.close();
    }

    private static Engine getRandomEngine() {
        List<Engine> engines = new ArrayList<>();
        engines.add(new Engine("Diesel Engine", 150, 2.0, "Дизел"));
        engines.add(new Engine("Petrol Engine", 200, 1.8, "Бензин"));
        engines.add(new Engine("Hybrid Engine", 180, 1.6, "Хибриден"));
        engines.add(new Engine("Electric Engine", 250, 0.0, "Електрически"));

        int randomIndex = (int) (Math.random() * engines.size());
        return engines.get(randomIndex);
    }

    private static List<String> getRandomExtras() {
        List<String> extras = new ArrayList<>();
        extras.add("climate");
        extras.add("navigation");
        extras.add("cruiseControl");
        extras.add("automaticTransmission");
        extras.add("powerWindows");

        List<String> selectedExtras = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            int randomIndex = (int) (Math.random() * extras.size());
            selectedExtras.add(extras.get(randomIndex));
        }

        return selectedExtras;
    }
}