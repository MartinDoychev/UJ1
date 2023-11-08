/*Направете програма, която очаква от потребителя да въведе размер на квадрат (0, 30] и го печата на екрана така:
# # # #
# # # #
# # # #
# # # # */
import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int square = 0;
        do{
            System.out.println("Моля, въведете размер на квадрат: ");
            square = in.nextInt();
            
        }while(square <= 0 && 30 < square);

        for(int i = 0; i < square; i++){
            for(int j = 0; j < square; j++){
                System.out.print('#');
            }
            System.out.println();
        }

        in.close();
    }
}

