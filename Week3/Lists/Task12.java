/*Напишете програма която:
Чете елементите на един списък от конзолата
Извежда в конзолата двойките индекси (i, j) на елементите които удовлетворяват следното условие: Ai*Aj<=max(Ai, Ai+1, … Aj), i<j
Например ако имаме списък с елементи 1 1 2 4 2 тогава очакваният изход е (1, 2), (1, 3), (1, 4), (1, 5), (2, 3), (2, 4), (2, 5), (3, 5) */
import java.util.ArrayList;
import java.util.Scanner;

    public class Task12 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = readList(scanner);
        printIndexPairs(list);

        scanner.close();
    }

    private static ArrayList<Integer> readList(Scanner scanner) {
        System.out.print("Въведете брой елементи в списъка: ");
        int size = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Въведете елементите на списъка:");

        for (int i = 0; i < size; i++) 
        {
            int element = scanner.nextInt();
            list.add(element);
        }
        return list;
    }

    private static void printIndexPairs(ArrayList<Integer> list) {
        System.out.println("Двойки индекси, които удовлетворяват условието:");

        for (int i = 0; i < list.size(); i++) 
        {
            for (int j = i + 1; j < list.size(); j++) 
            {
                int product = list.get(i) * list.get(j);
                int maxElement = Math.max(list.get(i), list.get(j));

                if (product <= maxElement) 
                    System.out.printf("(%d, %d)%n", i + 1, j + 1);
            }
        }
    }
}