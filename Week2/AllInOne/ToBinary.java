/*Нека потребителят въведе цяло положително число.
Тогава, използвайки цикъл, преобразувайте числото в двоичен вид и го разпечатайте на екрана, започвайки отзад напред.
Например: числото 10 в двоичен вид е 1010. Вие обаче трябва да отпечатате 0101. */
import java.util.Scanner;

public class ToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int binary = 0;
        int placeValue = 1;
        int reversed = 0;

        do{
            System.out.println("Моля, въведете число: ");
            num = in.nextInt();
        }while(num <= 0);

        while(num != 0){
            int remainder = num % 2;
            binary += remainder * placeValue;
            placeValue *= 10;
            num /= 2;
        }

        while(binary != 0){
            reversed *= 10;
            reversed += binary % 10;
            binary /= 10 ;
        }

        if(binary == 0){
                System.out.println("Обърнатото число в двоична система:" + "0" + reversed);
            }
        in.close();
    } 
}
