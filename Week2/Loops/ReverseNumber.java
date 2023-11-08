/*Направете програма, която печата цифрите на въведено от конзолата цяло число в обратен ред.
Ако числото е отрицателно – просто игнорирайте знака. */
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Моля, въведете число: ");
        int num = in.nextInt();

        int reversed = 0;

        while(num > 0){
            reversed *= 10;
            reversed += num % 10;
            num = num / 10;
        }
        System.out.println(reversed);
        in.close();    
    }
}
