/*Напишете програма, която подканва потребителя да въведе брой на състезателите и след това да въведе техния резултат в секунди и се записват в масив.
Отпечатва:
Всички резултати
Най-бързия
Най-бавния
Средно аритметично (avg)
Стандартно отклонение (standard deviation). За помощ:
сд1 = сумата от всички ( (елемент – avg) на квадрат)
сд = корен квадратен ( сд1 / броя на елементите)
Изкараният резултат трябва да е подобен на този в дадения пример! */
import java.util.Arrays;
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Въведете броя на състезалите:");
        int numPlayers = in.nextInt();
        double[] raceTimes = new double[numPlayers];

        for(int i = 0; i < numPlayers; i++){
            System.out.println("Времената на всеки състезател " + (i + 1) + "(в секунди): ");
            raceTimes[i] = in.nextDouble();
        }

        System.out.println("Резултат: ");
        for(double time : raceTimes){
            System.out.println(time);
        }

        Arrays.sort(raceTimes);
        double fastestTime = raceTimes[0];
        double slowestTime = raceTimes[numPlayers - 1];

        System.out.println("Най-бързия " + fastestTime + " секунди");
        System.out.println("Най-бавния " + slowestTime + " секунди");

        double sum = 0;
        int index = 0;

        while(index < raceTimes.length){
            double time  = raceTimes[index];
            sum += time;
            index++;
        }

        double avg = sum/numPlayers;
        System.out.println("Средно " + avg + " секунди");
        double sd1 = 0;
        int index1 = 0;

        while(index1 < raceTimes.length){
            double time = raceTimes[index];
            sd1 += Math.pow(time - avg, 2);
            index1++;
        }

        double sd = Math.sqrt(sd1/numPlayers);

        System.out.println("Стандартно отклонение " + sd + "в секунди");
        in.close();
    }
}
