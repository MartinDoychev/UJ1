/*Създайте клас PhoneBook който има списък List< String> data, който съдържа низове със следния формат: “име-номер”.
Напишете следните методи в класа PhoneBook
void insert – получава име и номер и ги добавя в списъка, но ако съществува запис с такъв номер го трие и на негово място слага новия запис.
boolean deleteByPhoneNumber – изтрива запис по номер, връща false ако няма такъв запис, а true когато намери такъв запис и го изтрие.
getAllNamesStartingWith – връща всички записи за които имената започват с даден низ
toString – връща низ съдържащ всички записи, като всеки запис е на нов ред
Създайте PhoneBookTest клас който:
Показва следното меню в конзолата: 
Изберете опция:
Добави нов запис
Изтрий запис по номер
Покажи всички записи които започват с низ
Принтирай toString
Изход
При избор на 1, показва “Въведете име:” и прочита въведеното име. После показва “Въведете телефонен номер:” и прочита въведения номер. Ако съществува запис за този номер, принтира “Запис за този номер съществува вече. Изберете 1, за да бъде презаписан или 0, за да се върнете към началното меню.”. Прочита избраната опция. При 1 – добавя записа във phoneBook-a, а при 0 – отново извежда менюто. (помислете какво да изведете при невалиден избор). Ако пък не съществува запис за този номера, тогава просто принтира “Записът се въвежда…” и въвежда записа. На края принтира “Изберете следваща опция” и чака за следващия избор на потребителя.
При избор на 2 показва “Въведете телефонния номер за който искате да бъде изтрит записът.” и прочита въведения номер.
В зависимост от това дали записът е бил успешно изтрит или не принтира “Записът беше успешно изтрит.” или “Запис за този номер не беше намерен.” Накрая принтира “Изберете следваща опция” и чака за следващия избор на потребителя.
При избор на 3 показва “Въведете низ.” и прочита въведния низ. Принтира “Всички записи, които започват с <въведния низ> са следните: <брой записи>” Принтира “Изберете следваща опция” и чака за следващия избор на потребителя.
При избор 4 принтира toString-а и след това принтира “Изберете следваща опция” и чака за следващия избор на потребителя. Hint: Помислете да изкарате в методи кода, който се налага да използвате повече от веднъж (ако има такъв). Hint: Не забравяйте да валидирате входните данни. Hint: Как ще се държи програмата ви когато данните в списъка свършат? */
import java.util.Scanner;
import java.util.List;

public class PhoneBookTest {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Изберете опция:");
            System.out.println("1. Добави нов запис");
            System.out.println("2. Изтрий запис по номер");
            System.out.println("3. Покажи всички записи които започват с низ");
            System.out.println("4. Принтирай toString");
            System.out.println("5. Изход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Въведете име:");
                    String name = scanner.nextLine();
                    System.out.println("Въведете телефонен номер:");
                    String phoneNumber = scanner.nextLine();

                    if (phoneBook.deleteByPhoneNumber(phoneNumber)) {
                        System.out.println("Запис за този номер съществува вече. Изберете 1, за да бъде презаписан или 0, за да се върнете към началното меню.");
                        int overwriteChoice = scanner.nextInt();
                        if (overwriteChoice == 1) {
                            phoneBook.insert(name, phoneNumber);
                            System.out.println("Записът беше успешно презаписан.");
                        } else {
                            System.out.println("Връщане към началното меню.");
                        }
                    } else {
                        System.out.println("Записът се въвежда...");
                        phoneBook.insert(name, phoneNumber);
                        System.out.println("Изберете следваща опция.");
                    }
                    break;
                case 2:
                    System.out.println("Въведете телефонния номер за който искате да бъде изтрит записът.");
                    String deletePhoneNumber = scanner.nextLine();
                    if (phoneBook.deleteByPhoneNumber(deletePhoneNumber)) {
                        System.out.println("Записът беше успешно изтрит.");
                    } else {
                        System.out.println("Запис за този номер не беше намерен.");
                    }
                    break;
                case 3:
                    System.out.println("Въведете низ:");
                    String prefix = scanner.nextLine();
                    List<String> matchingEntries = phoneBook.getAllNamesStartingWith(prefix);
                    System.out.println("Всички записи, които започват с '" + prefix + "' са следните: " + matchingEntries.size());
                    for (String entry : matchingEntries) {
                        System.out.println(entry);
                    }
                    break;
                case 4:
                    System.out.println(phoneBook.toString());
                    break;
                case 5:
                    System.out.println("Изход.");
                    System.exit(0);
                default:
                    System.out.println("Невалиден избор. Моля, изберете отново.");
                    break;
            }
        }
    }
}
