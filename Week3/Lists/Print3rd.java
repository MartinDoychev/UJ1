/*Напишете програма, която изисква от потребителя да въвежда имена от конзолата, като въвеждането приключва, когато потребителя въведе точка (.).
Отпечатайте 3-тото въведено име на екрана.
Сортирайте списъка и отпечатайте сортирания списък.
Какво ще направите ако няма 3ти елемент? Може би съобщение за грешка?
 */
import java.util.ArrayList;
import java.util.Scanner;

    public class Print3rd {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Моля, въведете имена. За да приключите, въведете точка (.)");

        String input;
        do {
            System.out.print("Моля, въведете име: ");
            input = scanner.nextLine();
            if (!input.equals(".")) {
                list.add(input);
            }
        } while (!input.equals("."));

        if (list.size() >= 3) 
            System.out.println("Третото въведено име е: " + list.get(2));
            
        else System.out.println("Няма достатъчно въведени имена.");

        sort(list);
        System.out.println("Сортирани имена: " + list);
        scanner.close();
    }

    private static void sort(ArrayList<String> names) {
        int n = names.size();
        
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (names.get(j).compareTo(names.get(j + 1)) > 0) 
                {
                    String temp = names.get(j);
                    names.set(j, names.get(j + 1));
                    names.set(j + 1, temp);
                }
            }
        }
    }
}
