/*Нека имаме следният масив:
int[] myArray = { 1, 4, 6, 2, 10, 5 };
Напишете програма, която очаква потребителят да въведе число и след това намира на кой индекс се намира това число в дадения масив.
Ако числото не е в масива, нека програмата отпечата -1. */

import java.util.Scanner;

public class FindElementIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] myArray = {1,4,6,2,10,5};
        System.out.println("Моля, въведете числото, което искате да намерите: ");
        int num = in.nextInt();
        int index = -1;

        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] == num){
                index = i;
                break;
            }
        }
        System.out.println("Позицията на числото е: " + index);
        in.close();
    }
}
