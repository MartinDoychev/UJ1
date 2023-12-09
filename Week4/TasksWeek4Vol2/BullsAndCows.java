/*
Бикове и крави е логическа игра за отгатване на цифри. 
Играе се от двама противника, като всеки се стреми да отгатне тайното число, намислено от другия. 
След всеки ход, противникът дава броя на съвпаденията.
Играта протича по следния начин. 
На лист хартия всеки участник написва своето тайно число. Тайните числа са четирицифрени, като цифрите не трябва да се повтарят. 
След това, последователно един след друг, играчите задават въпрос с предположение за числото на противника. 
Противникът отговаря, като посочва броя на съвпаденията – ако дадена цифра от предположението се съдържа в тайното число и се намира на точното място, тя е „бик“, ако е на различно място, е „крава“. */
import java.util.Scanner;

public class BullsAndCows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Правила на играта Бикове и крави:");
        System.out.println("1. Въведете тайното число (четирицифрено, без повтарящи се цифри).");
        System.out.println("2. След това въведете предположение и получете броя на биковете и кравите.");
        System.out.println("3. Продължавайте с предположения, докато откриете тайното число.");

        System.out.print("Въведете тайното число: ");
        String secretNumber = scanner.nextLine();

        while (!isValidNumber(secretNumber)) {
            System.out.print("Невалидно тайно число. Опитайте отново: ");
            secretNumber = scanner.nextLine();
        }
        int attempts = 0;

        while (true) {
            System.out.print("Въведете предположение: ");
            String guess = scanner.nextLine();

            while (!isValidNumber(guess)) {
                System.out.print("Невалидно предположение. Опитайте отново: ");
                guess = scanner.nextLine();
            }
            attempts++;

            String result = checkGuess(secretNumber, guess);
            System.out.println("Отговор: " + result);

            if (result.equals("4 бика")) {
                System.out.println("Браво! Познахте тайното число след " + attempts + " опита.");
                break;
            }
        }
        scanner.close();
    }

    private static boolean isValidNumber(String number) {
        if (number.length() != 4) 
            return false;

        for (int i = 0; i < number.length(); i++) 
        {
            char digit = number.charAt(i);
            
            if (!Character.isDigit(digit))
                return false;
    
            if (number.indexOf(digit, i + 1) != -1)
                return false;
        }
    
        return true;
    }

    private static String checkGuess(String secret, String guess) {
        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < secret.length(); i++) {
            char secretDigit = secret.charAt(i);
            char guessDigit = guess.charAt(i);

            if (secretDigit == guessDigit)
                bulls++;    
            
            else if (secret.contains(String.valueOf(guessDigit)))
                cows++;
        }

        return bulls + " бика и " + cows + " крави";
    }
}