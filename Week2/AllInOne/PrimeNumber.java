/*Направете програма, която очаква от потребителя да въведе число. След това проверява дали числото е просто и отпечатва true, ако е, false, ако не е.
Простото число може да се дели само на 1 и на себе си. Ако се дели на което и да е друго цяло число, тогава не е просто.
Подсказка: ако имате числото 77, тогава то определено няма как да се дели на числото 38 (= 77 / 2) или по-голямо. */

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Моля, въведете число: ");
        int num = in.nextInt();
        boolean flag = false;

        for(int i = 2; i < num; i++){
            if(num % i != 0){
                flag = true;
            }
            else{
                flag = false;
                break;
            }
        }
        if(flag)
        System.out.println("True");
        else
        System.out.println("False");
        in.close();
    }
    
}
