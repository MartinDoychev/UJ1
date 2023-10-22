/*Напишете програма, в която дефинирате 2 int променливи – month & day.
Програмата трябва да отпечатва true, ако денят е между 20-ти март (включително) и 20-ти юни (включително) и false, в противен случай.
Нека:
month = 4
day = 31 */

public class SpringSeason2 {
    public static void main(String[] args) {
        int month = 5;
        int day = 31;

        System.out.println((month == 3 && (20 <= day && day <= 31) ||  
        (month == 6 && (1 <= day && day <= 20)) || 
        ((4 == month && (day >= 1 && 30 >= day)) || (month == 5 && (day >= 1 && 31 >= day)))? "true" : "false"));
    }
    
}
