/*Направете метод, който отпечатва броя на цифри в дадено число.
Направете програма, която очаква от потребителя да въведе цяло число и след това извиква горният метод, за да отпечата броят на цифрите във веведеното число. */
import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цяло число: ");
        int number = scanner.nextInt();

        printDigitCount(number);
        scanner.close();
    }

    public static void printDigitCount(int number) {
        int digitCount = 0;
        while (number != 0)
        {
            number /= 10;
            digitCount++;
        }

        System.out.println("Брой на цифрите: " + digitCount);
    }
}