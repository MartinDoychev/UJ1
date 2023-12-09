/*Напишете програма която отпечата следните текстови графики на екрана:
# # # # # # # # # # #                #                          #
  # # # # # # # # #                # # #                      # # #
    # # # # # # #                # # # # #                  # # # # #
      # # # # #                # # # # # # #              # # # # # # #
        # # #                # # # # # # # # #          # # # # # # # # #
          #                # # # # # # # # # # #      # # # # # # # # # # #
         (a)                        (b)                 # # # # # # # # #
                                                          # # # # # # #
                                                            # # # # #
                                                              # # #
                                                                #
                                                               (c)
Потребителят трябва да въведе:
коя фигура иска да отпечата – a, b или c
размера на фигурата. */
import java.util.Scanner;

public class PrintPatterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Изберете фигура (a, b или c): ");
        char choice = scanner.next().charAt(0);
        System.out.println("Въведете размер на фигурата: ");
        int size = scanner.nextInt();

        switch (choice) {
            case 'a':
                printFigureA(size);
                break;
            case 'b':
                printFigureB(size);
                break;
            case 'c':
                printFigureC(size);
                break;
            default:
                System.out.println("Невалиден избор.");
        }
        scanner.close();
    }

    private static void printFigureA(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < size - i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    private static void printFigureB(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    private static void printFigureC(int size) {
        printFigureB(size);

        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}