/*Направете променлива, която е списък от цели числа. Инициализирайте списъка със следните елементи: 1, 4, 6, 2, 10, 5.
Напишете програма, която да премахне всеки елемент на нечетна позиция от списъка. Внимавайте с for-a – ако махнете първият елемент – вторият ще стане първи.
Може да почнете итерацията в обратен ред – отзад, напред */
import java.util.ArrayList;

    public class ListRemoveOdd {
        public static void main(String[] args) {
        // Инициализация на списъка
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(6);
        numbers.add(2);
        numbers.add(10);
        numbers.add(5);

        // Извикване на метода за премахване на елементите на нечетна позиция
        removeElementsAtOddPositions(numbers);

        // Извеждане на резултата
        System.out.println(numbers);
    }

    // Метод за премахване на елементите на нечетна позиция
    public static void removeElementsAtOddPositions(ArrayList<Integer> list) {
        // Създаване на нов списък, който ще съдържа елементите на четна позиция
        ArrayList<Integer> evenPositionElements = new ArrayList<>();

        // Обхождане на оригиналния списък и добавяне на елементите на четна позиция в новия списък
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                evenPositionElements.add(list.get(i));
            }
        }
        // Заместване на оригиналния списък с новия списък
        list.clear();
        list.addAll(evenPositionElements);
    }
}


