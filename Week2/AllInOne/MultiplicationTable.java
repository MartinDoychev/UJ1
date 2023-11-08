/*Вашата програма очаква от потребителя да въведе число. 
След това отпечатва таблица за умножението на това число със всички числа от 1 до 10.
Изхода на екрана трябва да е подобен на този даден в примера. */

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Моля, въведете число: ");
        int num = in.nextInt();
        int result = 0;

        for(int i = 1; i <= 10; i++){
            result = num * i;
            System.out.println(num + "x" + i + " = " + result);
        }
        in.close();
    }
}
