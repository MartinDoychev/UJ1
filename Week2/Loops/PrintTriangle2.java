/*Направете програма, която очаква от потребителя да въведе размер на триъгълник (0, 30] и го печата на екрана така:
# # # # # #
  # # # # #
    # # # #
      # # #
        # #
          #  */

import java.util.Scanner;

public class PrintTriangle2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int triangle2 = 0;
        do{
            System.out.println("Моля, въведете размер на триъгълник: ");
            triangle2 = in.nextInt();
        }while(triangle2 < 0 || 30 <= triangle2);

        for(int i = 0; i <= triangle2; i++){
            for(int j = triangle2 - i; j <= triangle2; j++){
                System.out.print("#");
            }
            System.out.println();
            System.out.printf("%.2d"," ");
        }
        in.close();
    }
    
}
