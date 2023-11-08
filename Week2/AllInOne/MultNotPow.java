/*Сметнете x^y , като използвате умножение в цикъл, вместо съответната операция от Math класа.
Потребителят трябва да въведе 2 int числа, а вие да отпечатате резултата от повдигането на степен.
Първото въведено число е x, a второто – y. */

import java.util.Scanner;

public class MultNotPow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Моля, въведете число: ");
        int x = in.nextInt();
        System.out.println("Моля, нашите на коя степен да бъде повдигнато: ");
        int y = in.nextInt();
        int temp = 0;
        temp = x;

        for(int i = 0; i < y - 1; i++){
            x *= temp;
        }
        System.out.println("Резултатът е: " + x);
        in.close();
    }
}
