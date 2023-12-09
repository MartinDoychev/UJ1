/*Направете променлива, която е списък от цели числа. Инициализирайте списъка със следните елементи: 1, 4, 6, 2, 10, 5.
Напишете програма, която очаква потребителя да въведе число и след това намира на кой индекс се намира това число в даденият масив.
Ако числото не е в списъка, нека програмата отпечата -1.
Вижте метода ArrayList.indexOf()
Помните ли задачата FindElementIndex ? Сравнете леснотата на работа с масиви спрямо списъци. */
import java.util.ArrayList;
import java.util.Scanner;

public class FindListElements {
    public static void main(String[] args) {
        // Дефиниране на списък
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(4);
        myList.add(6);
        myList.add(2);
        myList.add(10);
        myList.add(5);

        // Четене на число от потребителя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете число: ");
        int number = scanner.nextInt();

        // Намиране на индекса на числото в списъка
        int index = findIndex(myList, number);

        // Извеждане на резултата
        if (index != -1) 
            System.out.println("Числото " + number + " се намира на индекс " + index + " в списъка.");
        else 
            System.out.println("Числото " + number + " не се среща в списъка.");

            scanner.close();
        }
    public static int findIndex(ArrayList<Integer> list, int number) {
        return list.indexOf(number);
    }
}
