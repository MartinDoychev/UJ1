/*Нека имаме следният масив:
int[] myArray = { 1, 10, 15 };
Напишете програма, която очаква потребителя да въведе 3 числа, които съхранявате в масив.
Сверете дали елементите на въведения масив е същият, като myArray и ако е, отпечатайте “true”, в противен случай – “false”. */
import java.util.Scanner;

public class ArrayEquals {
    public static void main(String[] args) {
        int[] myArray = {1,10,15};
        int[] inputArray = new int [3];
        Scanner in = new Scanner(System.in);
        
        for(int i = 0; i < myArray.length; i++){
            System.out.println("Моля, въведете число " + (i + 1) + ":");
            inputArray[i] = in.nextInt();          
        }
        
        boolean flag = true;
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] != inputArray[i]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("true");
        }
        else
        System.out.println("false");
        in.close();
    }
}
