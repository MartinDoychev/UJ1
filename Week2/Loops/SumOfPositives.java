/*Напишете програма, която събира въведените от потребителя числа, докато въведе 0 или отрицателно число.
Нека всеки път преди потребителяt въведе число, да се отпечатва подканващ стринг “Въведете положително число: “. 
Потребителят трябва да може да въведе числото на същият ред, а не на следващ.
Отпечатайте :
Сумата с точност до вторият знак след десетичната запетая.
Кое е най-голямото въведено число
Кое е най-малкото въведено число
Помислете кой цикъл е най-добре да използвате? while, do-while или for? */

import java.util.Scanner;

public class SumOfPositives {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num = 0;
        double min = 0;
        double max = 0;
        double sum = 0;
        
        do{
            System.out.print("Моля, въведете положително число: ");
            num = Integer.parseInt(in.nextLine());

            if(num < min && num > 0) {
                min = num;
            }
            if (num > max){
                max = num;
            }
            sum += num;
        } while(num > 0);

        System.out.println("Най-голямото число е: " + max);
        System.out.println("Най-малкото число е: " + min);
        System.out.printf("Сумата е: %.2f", sum);
        in.close();
    }
}
