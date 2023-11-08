/* Напишете програма, която прочита 2 числа със запетая от конзолата и печата кое е по-голямото.
Отпечатаният резултат трябва да съдържа само числото без никакви допълнителни пояснения.
Например: “резултатът е 10” e невалидно.*/
import java.util.Scanner;

public class BigOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();

        if (num1 > num2 ){
            System.out.println(num1);
        }
        else
        System.out.println(num2);
        in.close();
    }
    
}
