import java.util.Scanner;

public class Palindrom2 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Моля, въведете дума: ");
        String word = in.nextLine().toLowerCase();
        boolean flag = false;

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == word.charAt((word.length() - 1) - i)) //mom'\0' --> lenght = 4; => lenght - 1 = 3
            {
                System.out.println(word.charAt(i) + "  --  " + word.charAt((word.length() - 1) - i));
                //при i = 0 => m o m -> word[0] ?= word[3 - 1 - 0] (word[2]) --> true
                //             0 1 2
                flag = true;
            }

            else 
            {
                System.out.println("Here's where it breaks: " + word.charAt(i) + " -x- " +  word.charAt((word.length() - 1) - i));
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.println("palin");

        else System.out.println("no");
        in.close();
    }

}