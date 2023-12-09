/*Създайте клас Car който има следните атрибути и методи
speed, regularPrice, color
getSalePrice()
Създайте клас Truck който наследява Car и има следните атрибути и методи
weight
getSalePrice() т.че ако weight > 2000 тогава има 10% намаление, иначе 20% намаление.
Създайте клас Ford който наследява Car и има следните атрибути и методи
year
manufacturerDiscount
getSalePrice() т. че от цената изчислена в класа Car да се извади manufacturerDiscount
Създайте клас Sedan който наследява Car и има следните атрибути и методи
length
getSalePrice() – ако дължината е > 6,5 метра -> 5% отстъпка, иначе 10% отстъпка
Създайте програма MyOwnAutoShop когато изпълнява следните стъпки в main() метода си.
Създава инстанция на класа Sedan инициализирайки всичките атрибути с подходящи стойности. 
Ползвайте ключовата дума super за да инициализирате атрибутите на супер класа.
Създава две инстанции на Ford и инциализира техните атрибути, задавайки им подходящи стойности. 
Отново ползвайте ключовата дума super.
Създава инстанция от класа Car инициализирайки всичките атрибути с подходящи стойности.
Създава инстанции и от класовете Truck, Sedan
Извежда в конзолата цените на всички инстанции. */
public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(120, 20000, "Blue", 7.2);

        Ford ford1 = new Ford(140, 25000, "Red", 2022, 1000);
        Ford ford2 = new Ford(150, 30000, "Green", 2021, 1200);

        Truck truck = new Truck(100, 35000, "Yellow", 2500);

        Car car = new Car(110, 18000, "Black");

        System.out.println("Sedan Price: $" + sedan.getSalePrice());
        System.out.println("Ford 1 Price: $" + ford1.getSalePrice());
        System.out.println("Ford 2 Price: $" + ford2.getSalePrice());
        System.out.println("Truck Price: $" + truck.getSalePrice());
        System.out.println("Car Price: $" + car.getSalePrice());
    }
}
