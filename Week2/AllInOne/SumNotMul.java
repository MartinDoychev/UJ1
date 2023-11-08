/*Пресметнете х*y като използвате операцията събиране в цикъл, а не умножение.
Потребителят трябва да въведе 2 int числа, а вие да отпечатате резултата от умножението.
Първото въведено число е x, a второто – y. */
import java.util.Scanner;

public class SumNotMul {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Моля, въведете число: ");
        int x = in.nextInt();
        System.out.println("Моля, въведе друго число: ");
        int y = in.nextInt();
        int sum = x;

        for(int i = 0; i < y - 1; i++){
            x += sum;
        }
        System.out.println(x);
        in.close();
    }
    
}
