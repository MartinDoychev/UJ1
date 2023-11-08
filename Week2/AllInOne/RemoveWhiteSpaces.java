/*Направете програма, която очаква от потребителя да въведе изречение.
След въвеждане на изречението, вашата програма трябва да премахне всички празни символи и табулация от изречението и да го отпечата на екрана.  */
import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Моля, напишете изречение: ");
        String sentence = in.nextLine();

        sentence = sentence.replace(" ","");
        System.out.println(sentence);
        in.close();
    }
}
