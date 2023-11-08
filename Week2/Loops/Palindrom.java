/*Направете програма, която прочита дума от конзолата и проверява дали е палиндром.
Игнорирайте малки-големи букви.
Ако думата е палиндром, да отпечата true, в противен случай false. */
import java.util.Scanner;

public class Palindrom {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Моля, въведете дума: ");
        String word = in.nextLine().toLowerCase();
        boolean flag = false;

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == word.charAt((word.length() - 1) - i))
            {
                flag = true;
            }
            else 
            {
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("true");

        else System.out.println("false");
        in.close();
  }  
}
