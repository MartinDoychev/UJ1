/*Напишете програма, която изисква от потребителя да въведе 3 имена от конзолата.
След това, имената се сортират в азбучен ред и се отпечатват на екрана. */
import java.util.ArrayList;
import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Моля, въведете 3 имена.");

        for (int i = 0; i < 3; i++) {
            System.out.print("Моля, въведете име: ");
            String input = scanner.nextLine();
            list.add(input);
        }

        sort(list);
        System.out.println("Сортирани имена: " + list);
        scanner.close();
    }
    private static void sort(ArrayList<String> names) {
        int n = names.size();
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (names.get(j).compareTo(names.get(j + 1)) > 0) {
                    String temp = names.get(j);
                    names.set(j, names.get(j + 1));
                    names.set(j + 1, temp);
                }
            }
        }
    }
}
