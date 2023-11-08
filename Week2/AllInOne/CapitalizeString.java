/*Направете програма, която очаква потребителят да въведе едно цяло изречение.
Нека вашата програма прочете изречението и след това, ако започва с малка буква да я смени на голяма. 
Нека добави точка, ако изречението не завършва със символ за край на изречението – точка, удивителна или въпросителна. */
import java.util.Scanner;

public class CapitalizeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Моля, напишете някакво изречение: ");
        String sentence = in.nextLine();

        if(sentence.charAt(0) >= 'a' && 'z' >= sentence.charAt(0)){
            char firstChar = Character.toUpperCase(sentence.charAt(0));
            sentence = firstChar + sentence.substring(1);
        }


        if (sentence.charAt(sentence.length() - 1) == ' ') {
            sentence = sentence.substring(0, sentence.length() - 1) + ".";
            System.out.println(sentence);
        }

        else if(sentence.charAt(sentence.length() - 1) != '!' || sentence.charAt(sentence.length() - 1) != '?' || sentence.charAt(sentence.length() - 1) !='.'){
            System.out.println(sentence + ".");
        }
        in.close();
    }
}
