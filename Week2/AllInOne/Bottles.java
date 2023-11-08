/*Използвайте цикъл, за да направите програма, която отпечатва текста на класиката:
99 bottles of beer on the wall, 99 bottles of beer.
Take one down and pass it around, 98 bottles of beer on the wall.
…..
2 bottles of beer on the wall, 2 bottles of beer.
Take one down and pass it around, 1 bottle of beer on the wall.
1 bottle of beer on the wall, 1 bottle of beer.
Take it down and pass it around, no more bottles of beer on the wall.
No more bottles of beer on the wall, no more bottles of beer.
Go to the store and buy some more, 99 bottles of beer on the wall.
Важно е между всеки стих да има празен ред! */

public class Bottles {
    public static void main(String[] args) {
        int bottles = 99;
        
        for(int i = bottles; i > 0; i--){
            System.out.printf("%d bottles of beer on the wall, %d bottles of beer.%n%n",bottles,bottles);
            bottles--;
            if(bottles == 0){
                System.out.printf("Take one down and pass it around, no more bottles of beer on the wall.%n%nGo to the store and buy some more, 99 bottles of beer on the wall."); 
                break;   
            }
            System.out.printf("Take one down and pass it around, %d bottles of beer on the wall.%n%n",bottles);
        }
    }
}
