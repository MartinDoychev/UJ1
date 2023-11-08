/*Изпишете не екрана на конзолата числата от 1 до 40 включително, които се делят без остатък на 3.
Нека всяко число, делящо се на 3, е отпечатано на отделен ред.
Използвайте оператора %. */
public class Div3 {
    public static void main(String[] args) {
        int num = 0;

        for(num = 1; num <= 40; num++){
            if(num % 3 == 0){
                System.out.println(num);
            }
        }
    }
}
