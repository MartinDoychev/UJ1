/*Напишете програма, която прочита число от конзолата и отпечатва дали то е четно или нечетно.
Ако числото е четно, трябва да се изпише “even” (без кавичките), а ако е нечетно – трябва да се изпише “odd”. */

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num;
        num = scanner.nextInt();
        System.out.println(num % 2 == 0 ? "even" : "odd" );
    }
}
