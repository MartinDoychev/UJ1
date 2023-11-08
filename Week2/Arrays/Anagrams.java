/*Направeте програма, която прочита две думи от конзолата и отпечатва true, ако те са анаграми и false, ако не са. 
Абстрахирайте се от големината на буквите.
Анаграми са Java и Vaaj например. И двата стринга са съставени от едни и същи букви, които са в разбъркан ред.
Подсказка: String.toCharArray() методът ще ви помогне да конвертирате стринга в масив от char елементи. 
За да може да сравните дали са еднакви, ще се наложи да ги подредите по един и същ ред. */

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Моля, въведете дума: ");
        String word1 = in.nextLine().toLowerCase();

        System.out.println("Моля, въведе още една дума: ");
        String word2 = in.nextLine().toLowerCase();

        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if(Arrays.equals(charArray1, charArray2)){
            System.out.println("true");
        }
        else
        System.out.println("false");
        in.close();
    }
}
