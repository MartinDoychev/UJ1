/*Направете програма, която:
Очаква потребителят да въведе редове (<10). Докато потребителят не въведе коректен ред, програмата продължава да го пита за броя на редовете. Използвайте подканващ стринг “Брой редове: “
Очаква потребителят да въведе колони (<10). Докато потребителят не въведе коректна колона, програмата продължава да го пита за броя на колоните. Използвайте подканващ стринг “Брой колони: “
Иска от него да въведе двете матрици, които са съставени от цели числа. Използвайте същите подканващи низове като в дадения пример.
След това тя трябва да отпечата:
Двете матрици една до друга. Отделете двете матрици с низа ” | “
стринга “Сумата на матриците е:” на отделен ред
Сборът им (поелементарна сума)
стрингът “Директната сумата на матриците е:” на отделен ред
Сборът им (пряка/директна сума)
Като отпечатвате елементите на матрицата, нека те заемат 4 символа и да са подравняване наляво. */
import java.util.Scanner;

public class TheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = readSize(scanner, "Брой редове:");
        int columns = readSize(scanner, "Брой колони:");

        int[][] matrix1 = readMatrix(scanner, rows, columns, "Първа матрица:");
        int[][] matrix2 = readMatrix(scanner, rows, columns, "Втора матрица:");

        printMatrices(matrix1, matrix2);

        int[][] sumMatrix = calculateSum(matrix1, matrix2);
        printMatrix("Сумата на матриците е:", sumMatrix);

        int directSum = calculateDirectSum(matrix1, matrix2);
        System.out.println("Директната сума на матриците е: " + directSum);

        scanner.close();
    }

    private static int readSize(Scanner scanner, String prompt) {
        int size;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Моля, въведете цяло число.");
                scanner.next(); 
            }
            size = scanner.nextInt();
        } while (size <= 0 || size >= 10);

        return size;
    }

    private static int[][] readMatrix(Scanner scanner, int rows, int columns, String prompt) {
        System.out.println(prompt);

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Въведете елемент [%d][%d]: ", i + 1, j + 1);
                while (!scanner.hasNextInt()) {
                    System.out.println("Моля, въведете цяло число.");
                    scanner.next();
                }
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static void printMatrices(int[][] matrix1, int[][] matrix2) {
        printMatrix("Първа матрица:", matrix1);
        System.out.println("|");
        printMatrix("Втора матрица:", matrix2);
    }

    private static void printMatrix(String label, int[][] matrix) {
        System.out.println(label);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] calculateSum(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] sumMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return sumMatrix;
    }

    private static int calculateDirectSum(int[][] matrix1, int[][] matrix2) {
        int sum = 0;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                sum += matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }
}
