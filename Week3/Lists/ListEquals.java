/*Създайте списък от цели числа със следните елементи: { 1, 10, 15 }
Напишете програма, която очаква потребителя да въведе 3 числа, които съхранявате в друг списък.
Сверете дали елементите на въведения списък са същите като в първия и ако са, отпечатайте “true”, в противен случай – “false”.
Кой метод трябва да използвате тук? */
import java.util.ArrayList;
import java.util.Scanner;

public class ListEquals {
    public static void main(String[] args) {
        // Инициализация на първия списък
        ArrayList<Integer> initialList = new ArrayList<>();
        initialList.add(1);
        initialList.add(10);
        initialList.add(15);

        // Четене на числа от потребителя и създаване на втория списък
        ArrayList<Integer> inputList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Въведете число: ");
            int number = scanner.nextInt();
            inputList.add(number);
        }

        // Проверка дали елементите на втория списък са същите като на първия
        boolean equal = checkEquality(initialList, inputList);

        // Извеждане на резултата
        System.out.println(equal);
        scanner.close();
    }

    public static boolean checkEquality(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.equals(list2);
    }
}
