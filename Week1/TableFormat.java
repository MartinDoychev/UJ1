/*Нека имате ученици със следните оценки: Иванчо – 2, Марийка – 6, Пенчо – 4, Голям Петко – 5. 
Използвайте printf да отпечатате оценките им в табличен вид, всеки ученик – на отделен ред.
Нека дължината на колоната с имената е 20 символа, а колоната с оценките да е 2 символа.
Имената са първи и са приравнени наляво. Втората колона с оценките е приравнена надясно. */

public class TableFormat {
    public static void main(String[] args) {
        String person1 = "Иванчо";
        String person2 = "Марийка";
        String person3 = "Пенчо";
        String person4 = "Голям Петко";
        int note1 = 2;
        int note2 = 6;
        int note3 = 4;
        int note4 = 5;

        System.out.printf("|%-20s|" + "%2d|\n", person1, note1);
        System.out.printf("|%-20s|" + "%2d|\n", person2, note2);
        System.out.printf("|%-20s|" + "%2d|\n", person3, note3);
        System.out.printf("|%-20s|" + "%2d|\n", person4, note4);
    }
    
}