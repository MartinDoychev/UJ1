/*Напишете програма, която чете 1 число от конзолата, 
изчислява му корен квадратен и отпечатва резултата на екрана с точност до 5-тия знак след запетаята. */

import java.util.Scanner;

public class InputandSqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num = Integer.parseInt(scanner.nextLine()); 
    
        double result = Math.sqrt(num);
        System.out.printf("%.5f", result);

    }
    
}
