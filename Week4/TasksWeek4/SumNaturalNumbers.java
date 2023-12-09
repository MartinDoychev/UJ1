/*Целите, положителни числа 1,2,3 … се казват още натурални числа.
Нека вашата програма очаква от потребителя да въведе едно число и после използвайки рекурсивна функция, да изчисли сбора на всички числа от 1 до въведеното число. */
import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете число: ");
        int n = scanner.nextInt();
        int sum = calculateSum(n);

        System.out.println("Сборът на всички натурални числа от 1 до " + n + " е: " + sum);
        scanner.close();
    }

    public static int calculateSum(int num) {
        int sum = 0;
    
        for (int i = 1; i <= num; i++) {
            sum += i;
        }   
        return sum;
    }
}