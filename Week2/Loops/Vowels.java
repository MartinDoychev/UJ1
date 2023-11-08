/*Направете програма Vowels, която прочита изречение (на английски) от конзолата и отпечатва колко гласни има в него.
Дължината на String можете да вземете чрез метода String.length(), например: “hello world”.length(). 
А за да вземете първият символ от стринга, ползвайте “hello world”.charAt(0) */

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Моля, напишете някакво изречение: ");
        String sentence = in.nextLine().toLowerCase();
        int count = 0;
           
        for(int i = 0; i < sentence.length(); i++){
            char letter = sentence.charAt(i);
            if('a' == letter || 'o' == letter || 'e' == letter || 'i' == letter || 'u' == letter || 'y' == letter){
                count++;
            }
        }

        System.out.println(count);
        in.close();
    }
    
}
