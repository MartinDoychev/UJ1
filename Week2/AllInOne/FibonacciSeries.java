/*Направете програма, която отпечатва първите n числа от серията на Фибоначи.
Серията на Фибоначи се състои от числа, където всяко едно число е сбор от предишните 2 числа. А първите 2 числа са 0 и 1. Пример: 0, 1, 1, 2, 3, 5, 8, 13, 21, …
Броят на числата n, които трябва да се отпечатат се въвеждат от конзолата.
Отпечатайте числата с един интервал между всяко едно число. */
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Моля, въведе число: ");
        int n = in.nextInt();
        int in1 = 0;
        int in2 = 1;
        
        System.out.print(in1 + " " + in2 + " ");
        for(int i = 2; i <= n; i++){
            int next = in1 + in2;
            System.out.print(next + " ");
            in1 = in2;
            in2 = next;
        }
        in.close();
    }
}
