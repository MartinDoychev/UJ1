/*Напишете програма, която сумира елементите на масив от цели числа и отпечатва резултата на екрана.
Инициализирайте масива със следните числа:
-1
10
4.5
15
3.278 */
public class Arraysum {
    public static void main(String[] args) {
        double[] myArray = {-1,10,4.5,15,3.278};
        int sum = 0;

        int i = 0;
        while(i < myArray.length){
            sum += myArray[i];
            i++;
        }
        System.out.println("Сумата на елементите е: " + sum);
    }
}
