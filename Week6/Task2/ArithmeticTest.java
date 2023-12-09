/*Напишете клас Arithmetic който има метод add. Методът приема като аргументи две цели числа и връща тяхната сума.
	•	Напишете клас Adder който наследява Arithmetic.
	•	В ArithemticTest.java създайте променлива “arithmetic” от тип Arithmetic която да е инстанция на Adder. 
    Принтирайте в конзолата следните редове: System.out.println(arithmetic.getClass()); System.out.println(arithmetic.getClass().getSuperclass()); 
    Ако не разбирате какво означава този изход кажете ми на следващата лекция за да го обясним.
	•	Сега добавете още един метод add в клас Arithmetic който събира неопределен брой цели числа.
	•	В main метода генерирайте цяло число N между 2 и 20 включително. След това генерирайте N на брой случайни цели числа и ги подайте на add метода.
	•	А сега нека N = 2,000,000,000 -> Какво стана? */
public class ArithmeticTest {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Adder();

        System.out.println(arithmetic.getClass());
        System.out.println(arithmetic.getClass().getSuperclass());

        int N = (int) (Math.random() * 19) + 2;

        int[] randomNumbers = new int[N];
        for (int i = 0; i < N; i++) {
            randomNumbers[i] = (int) (Math.random() * 100);
        }

        int result = arithmetic.add(randomNumbers);

        System.out.println("Сумата на случайните числа е: " + result);

        int[] largeRandomNumbers = new int[2000000000];
        for (int i = 0; i < 2000000000; i++) {
            largeRandomNumbers[i] = (int) (Math.random() * 100); 
        }

        int largeResult = arithmetic.add(largeRandomNumbers);

        System.out.println("Сумата на големите случайни числа е: " + largeResult);
    }
}
