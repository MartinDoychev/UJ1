/*Направете програма, която очаква от потребителяt да въведе:
Изречение
Символ
Нека вашата програма изчисли колко пъти въведения символ се среща в изреченито и да го отпечата на екрана.
Метода str.charAt(i) връща символа от даденият стринг на позиция i. */
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Моля, напишете някакво изречение: ");
        String sentence = in.nextLine();
        System.out.println("Моля, въведете някакъв символ: ");
        char symbol = in.next().charAt(0);
        int count = 0;

        for(int i = 0; i <= sentence.length() - 1; i++){
            if(sentence.charAt(i) == symbol){
                count++;
            }
        }
        System.out.println(count);
        in.close();
    }
}
