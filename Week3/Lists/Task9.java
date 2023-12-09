/*Напишете програма която:
Чете от конзолата числа които са елементи на List
Извежда следната информация за списъка: дължина, всички елементи
Сортира списъка и извежда резултата
Обръща елементите на списъка (1 2 3 -> 3 2 1)
Чете елементите на втори списък.
Сравнява двата списъка елемент по елемент и на всяка итерация извежда следното съобщение “Елемент N от списък 1 е по-малък/по-голям от елемент X от списък 2.” */
import java.util.ArrayList;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list1 = readList(scanner, "първия");

        printListInfo(list1, "първия");
        sortList(list1);
        printListInfo(list1, "първия след сортиране");

        reverseList(list1);
        printListInfo(list1, "първия след обръщане");

        ArrayList<Integer> list2 = readList(scanner, "втория");

        compareLists(list1, list2);
        scanner.close();
    }

    private static ArrayList<Integer> readList(Scanner scanner, String listName) {
        System.out.print("Въведете брой елементи за " + listName + " списък: ");
        int size = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Въведете елементите за " + listName + " списък:");

        for (int i = 0; i < size; i++) {
            int element = scanner.nextInt();
            list.add(element);
        }

        return list;
    }

    private static void printListInfo(ArrayList<Integer> list, String listName) {
        System.out.println("Информация за " + listName + " списък:");
        System.out.println("Дължина: " + list.size());
        System.out.println("Елементи: " + list);
    }

    private static void sortList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    private static void reverseList(ArrayList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }

    private static void compareLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        System.out.println("Сравнение на двата списъка:");

        int minLength = Math.min(list1.size(), list2.size());

        for (int i = 0; i < minLength; i++) {
            int element1 = list1.get(i);
            int element2 = list2.get(i);

            if (element1 < element2)
                System.out.println("Елемент " + element1 + " от първия списък е по-малък от елемент " + element2
                        + " от втория списък.");

            else if (element1 > element2)
                System.out.println("Елемент " + element1 + " от първия списък е по-голям от елемент " + element2
                        + " от втория списък.");

            else
                System.out.println("Елемент " + element1 + " от първия списък е равен на елемент " + element2
                        + " от втория списък.");
        }

        if (list1.size() < list2.size())
            System.out.println("Първият списък е по-къс от втория.");

        else if (list1.size() > list2.size())
            System.out.println("Вторият списък е по-къс от първия.");

    }
}