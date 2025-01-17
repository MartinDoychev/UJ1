/*Създайте абстрактен клас Animal който: атрибут legs 
– представлява броя крака на животното конструктор който инициализира legs абстрактен метод eat() метод walk() – 
Който принтира “I am walking by moving my <n> legs.”
Създайте клас Spider който наследява Animal Нека Spider има дефолтен конструктор който създава Spider с 8 крака. 
Имплементирайте метода еат() в Spider
Създайте интерфейс Pet който има следните методи: getName() setName() play()
Създайте клас Cat който наследява Animal и имплементира Pet. Cat има атрибут name. 
Има конструктор който приема name като аргумент и създава Cat със зададеното име и 4 крака. 
Добавете и дефолтен конструктор който инициализира Cat с празно име и 4 крака. Имплементира методите на Pet Имплементира eat()
Създайте клас Fish който наследява Pet и показва, че рибите не могат да ходят и нямат крака.
Създайте програма TestAnimals която създава следните обекти:
6.1. Fish
6.2. Cat на име Fluffy
6.3. Animal който е инстанция на Fish
6.4. Animal който е инстанция на Spider
6.5. Pet който е инстанция на Cat
Изведете в конзолата следния изход:
6.6 Fish with name: <name> и резултатите от извикаването на методите walk(), eat(), play()
6.7 Cat with name: <name> и резултатите от извикаването на методите walk(), eat(), play()
6.8 [За подточка 6.3 ]The Animal is <Animal concrete implementation> and its name is: <name>, и резултатите от извикаването на методите walk(), eat()
6.9 [За подточка 6.4 ]The Animal is <Animal concrete implementation>, резултатите от извикаването на walk() и eat().
7.0 [За подточка 6.5 ]The Pet is <Pet concrete implementation> and its name is: <name>, и резултатите от извикаването на методите walk(), eat(), play()
7.Направете методът play() да има default имплементация в Pet interface-a т. че play() да извежда в конзолата “I am playing on my own”. 
Изведете в конзолата резултата от извикването на play() за котката Fluffy. 
Сега нека Cat имплементира play т че да извежда “I like playing with wool balls” */
public class TestAnimals {
    public static void main(String[] args) {
        Fish fish = new Fish("Nemo");
        Cat fluffy = new Cat("Fluffy", 4);
        Animal fishAsAnimal = new Fish("Dory");
        Animal spiderAsAnimal = new Spider();
        Pet catAsPet = new Cat("Whiskers", 4);

        System.out.println("6.6 Fish with name: " + fish.getName());
        fish.walk();
        fish.eat();
        fish.play();

        System.out.println("6.7 Cat with name: " + fluffy.getName());
        fluffy.walk();
        fluffy.eat();
        fluffy.play();

        System.out.println("6.8 The Animal is " + fishAsAnimal.getClass().getSimpleName() +
                " and its name is: " + ((Pet) fishAsAnimal).getName());
        fishAsAnimal.walk();
        fishAsAnimal.eat();

        System.out.println("6.9 The Animal is " + spiderAsAnimal.getClass().getSimpleName());
        spiderAsAnimal.walk();
        spiderAsAnimal.eat();

        System.out.println("7.0 The Pet is " + catAsPet.getClass().getSimpleName() +
                " and its name is: " + catAsPet.getName());
        catAsPet.walk();
        catAsPet.eat();
        catAsPet.play();
    }
}