/*Напишете програма която:
Чете два списъка от конзолата
Сортира ги
Обединява ги в един нов трети списък. */
import java.util.ArrayList;
import java.util.Scanner;

    public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list1 = readList(scanner, "първия");
        sortList(list1);

        ArrayList<Integer> list2 = readList(scanner, "втория");
        sortList(list2);

        ArrayList<Integer> mergedList = mergeSortedLists(list1, list2);

        System.out.println("Сортираният обединен списък: " + mergedList);
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

    private static void sortList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) 
        {
            for (int j = i + 1; j < list.size(); j++) 
            {
                if (list.get(i) > list.get(j)) 
                {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    private static ArrayList<Integer> mergeSortedLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;

        while (index1 < list1.size() && index2 < list2.size()) 
        {
            if (list1.get(index1) < list2.get(index2)) 
            {
                mergedList.add(list1.get(index1));
                index1++;
            } 
            else {
                mergedList.add(list2.get(index2));
                index2++;
            }
        }
        while (index1 < list1.size()) 
        {
            mergedList.add(list1.get(index1));
            index1++;
        }
        while (index2 < list2.size()) 
        {
            mergedList.add(list2.get(index2));
            index2++;
        }
        return mergedList;
    }
}