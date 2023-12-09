/*Caesar’s Code е една от най-проститите техники за криптиране. Всяка една буква от изречението е заменена с друга буква, която е (n) на брой позиции в азбуката.
Така ‘A’ се заменя с ‘D’, ‘B’, с ‘E‘ … ,’X’ със ‘A’ …, ‘Z’ със ‘C’.
Напишете програма която иска от потребителя да направи избор – дали да криптира или да декриптира.
Въвежда се кода (n) – броят на позицииите.
След това потребителят трябва да въведе стринг, който може да съдържа както малки, така и големи латински букви и съответно генерира криптиран стринг, или декодира въведеният стринг.
Резултатът винаги се печата само с големи букви.
В програмата си дефинирайте статични методи, наречете ги crypt & decrypt. */
import java.util.Scanner;

public class CeasarCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Изберете опция (1 - Криптиране, 2 - Декриптиране): ");
        int option = scanner.nextInt();
        System.out.print("Въведете брой позиции за криптиране/декриптиране (n): ");
        int n = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Въведете текст: ");
        String inputText = scanner.nextLine();

        if (option == 1) {
            String encryptedText = crypt(inputText, n);
            System.out.println("Криптиран текст: " + encryptedText);
        } 
        
        else if (option == 2) {
            String decryptedText = decrypt(inputText, n);
            System.out.println("Декриптиран текст: " + decryptedText);
        } 
        
        else 
            System.out.println("Невалидна опция"); 

        scanner.close();
    }
    public static String crypt(String text, int n) {
        return shiftText(text, n);
    }

    public static String decrypt(String text, int n) {
        return shiftText(text, -n);
    }

    private static String shiftText(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) 
        {
            if (Character.isLetter(ch)) 
            {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                char shiftedChar = (char) ((ch - base + shift + 26) % 26 + base);
                result.append(shiftedChar);
            } 
            
            else 
                result.append(ch);
        }
        return result.toString();
    }
}
