import java.util.Scanner;

public class DropSong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        
        do{
            System.out.println("Моля, въведете число: ");
            num = in.nextInt();
            
            if (num == 0){
                System.out.println("Пльок Пляс Пльос");
                break;
            }
            if(num % 3 == 0){
                System.out.println("Пльок");
            }
            else if(num % 5 == 0){
                System.out.println("Пляс");
            }
            else if(num % 7 == 0){
                System.out.println("Пльос");
            }
            else
            System.out.println(num);
        }while(num <= 0);
        in.close();
    }    
}
