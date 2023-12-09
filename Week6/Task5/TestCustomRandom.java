/*Дефинирайте наследник на клас наследник Random, който да има метод връщащ случайни числа от тип double в интервал double [а,b]. 
(Разгледайте какви методи вече са дефинирани и вижте кой е най-лесно да бъде модифициран, така, че да ви свърши работа */
public class TestCustomRandom {
    public static void main(String[] args) {
        CustomRandom customRandom = new CustomRandom();

        double randomDouble = customRandom.getRandomDoubleInRange(1.0, 10.0);
        System.out.println("Random Double: " + randomDouble);
    }
}