/*Направете програма Factorial, която изчислява факториел на положително число въведено от конзолата.
Потребителят може да въведе невалидно число (нула или отрицателно). 
Искайте да въведе число, докато не въведе положително. */
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 1;
        do{
            System.out.println("Моля, въведете число: ");
            num = in.nextInt();
        }while(num <= 0);
        for(int i = 1;i <= num; i++){
            sum *= i;
        }
        System.out.println("Резултат: " + sum);
        in.close();
    }
    
}
