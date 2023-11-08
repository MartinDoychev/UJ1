/*Да се отпечата “с думи” броя на думите във въведеното изречение на български език.
Използване на String.split().length за да определите броят на думите.
Ако са повече от 10 – просто отпечатва “твърде дълго изречение” (без кавичките) */
import java.util.Scanner;

public class NumberOfWords {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String sentence = in.nextLine();

        if (sentence.split(" ").length > 10) {
            System.out.println("Твърде дълго изречение! ");
        }
        else {
            int result = sentence.split(" ").length;
            String count = "";
            switch (result)
            {
                case 1: 
                {
                    count = "Една";
                    break;
                }
                case 2:
                {
                    count = "Две";
                    break;
                }
                case 3:
                {
                    count = "Три";
                    break;
                }
                case 4:
                {
                    count = "Четири";
                    break;
                }
                case 5:
                {
                    count = "Пет";
                    break;
                }
                case 6:
                {
                    count = "Шест";
                    break;
                }
                case 7:
                {
                    count = "Седем";
                    break;
                }
                case 8:
                {
                    count = "Осем";
                    break;
                }
                case 9:
                {
                    count = "Девет";
                    break;
                }
                case 10:
                {
                    count = "Десет";
                    break;
                }
            }
            System.out.println("Броя на думите е: " + count);
        }
        in.close();
    }
}
