/*Напишете програма, която събира въведените от потребителя цели числа. Въвеждането продължава докато потребителя въведе 0. */
import java.util.ArrayList;
import java.util.Scanner;

    public class ListSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        int number = 0;

        System.out.println("Въведете цели числа. Въведете 0, за да приключите.");

        do {
            System.out.print("Въведете число: ");
            number = scanner.nextInt();
            list.add(number);
        } while (number != 0);

        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Сумата на въведените числа е: " + sum);
        scanner.close();
    }
}
