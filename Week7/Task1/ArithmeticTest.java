/*Създайте интерфейс AdvancedArithmetic който има абстрактен метод divisorSum(n).
Създайте клас Calculator който имплементира AdvancedArithmetic т. че divisorSum(n) да връща сбора на всички числа които делят n. */
public class ArithmeticTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.getClass());
        System.out.println(calculator.getClass().getSuperclass());

        int N = (int) (Math.random() * 19) + 2;

        int result = calculator.divisorSum(N);

        System.out.println("Сумата на делителите на " + N + " е: " + result);
    }
}