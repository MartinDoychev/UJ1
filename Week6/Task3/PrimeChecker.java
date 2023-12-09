/*Напишете клас PrimeChecker който има метод checkPrime.
Напишете програма която чете от входа N nа брой числа и извежда в конзолата само простите. (N може да бъде първото въведено число)
Примерен вход: 3 (N) 5 (number 1) 6 (number 2) 7 (number 3)
Примерен изход: 5, 7 */
import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            printPrimes(numbers, i + 1);
        }

        scanner.close();
    }

    private static void printPrimes(int[] numbers, int count) {
        System.out.print("Prime numbers entered so far: ");

        for (int i = 0; i < count; i++) {
            if (isPrime(numbers[i])) {
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println();
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
