/*Направете програма, която очаква от потребителя да въведе размер на триъгълник (0, 30] и го печата на екрана така:
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1 */

import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int triangle = 0;
        do{
            System.out.println("Моля, въведете размер на триъгълник: ");
            triangle = in.nextInt();
        }while(triangle < 0 || 30 <= triangle);

        for(int i = 0; i <= triangle; i++) {
            for(int j = 0; j <= triangle - i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }

        in.close();
    }
    
}
