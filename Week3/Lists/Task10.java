/*Напишете програма която:
1.Чете два списъка от конзолата
2.Извежда в конзолата тяхното обединение и сечение. Ползвайте ArrayList или LinkedList. */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

    public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете елементите на първия списък, разделени с интервали:");
        ArrayList<Integer> list1 = readList(scanner);

        System.out.println("Въведете елементите на втория списък, разделени с интервали:");
        ArrayList<Integer> list2 = readList(scanner);

        ArrayList<Integer> unionList = getUnion(list1, list2);
        System.out.println("Обединение: " + unionList);

        ArrayList<Integer> intersectionList = getIntersection(list1, list2);
        System.out.println("Сечение: " + intersectionList);

        scanner.close();
    }

    private static ArrayList<Integer> readList(Scanner scanner) {
        String input = scanner.nextLine();
        String[] elements = input.split("\\s+");
        ArrayList<Integer> list = new ArrayList<>();

        for (String element : elements) {
            list.add(Integer.parseInt(element));
        }

        return list;
    }

    private static ArrayList<Integer> getUnion(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Set<Integer> unionSet = new HashSet<>(list1);
        unionSet.addAll(list2);
        return new ArrayList<>(unionSet);
    }

    private static ArrayList<Integer> getIntersection(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Set<Integer> intersectionSet = new HashSet<>(list1);
        intersectionSet.retainAll(list2);
        return new ArrayList<>(intersectionSet);
    }
}