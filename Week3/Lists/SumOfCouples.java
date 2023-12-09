/*Напишете програма, която изисква от потребителя да въвежда цели числа от конзолата и въвеждането продължава, докато въведе 0. (Игнорирайте нулата и не я слагайте в масива/списъка)
След това потребителят трябва да въведе още едно число sum.
Отпечатайте всички двойки числа от въведените преди това, чиято сума е равна на sum.
Например, ако потребителят въведе числата [2, 3, 4, 5, 1] и след това въведе сумата 6, тогава трябва да отпечата:
2 4
5 1 */
import java.util.Scanner;
import java.util.ArrayList;

    public class SumOfCouples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Въведете цели числа. За да приключите, въведете 0:");

        int input;
        do {
            System.out.print("Въведете число: ");
            input = scanner.nextInt();

            if (input != 0)
                list.add(input);

        } while (input != 0);

        System.out.print("Въведете още едно число: ");
        int sum = scanner.nextInt();

        findPairs(list, sum);

        scanner.close();
    }

    private static void findPairs(ArrayList<Integer> list, int sum) {
        System.out.println("Двойките числа със сума " + sum + " са:");

        for (int i = 0; i < list.size() - 1; i++) 
        {
            for (int j = i + 1; j < list.size(); j++) 
            {
                if (list.get(i) + list.get(j) == sum) 
                    System.out.println(list.get(i) + " " + list.get(j));
            }
        }
    }
}

