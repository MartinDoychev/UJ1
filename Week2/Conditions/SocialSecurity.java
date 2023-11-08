import java.util.Scanner;

public class SocialSecurity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Моля, въведете Вашата заплата: ");
        int monthlySalary = in.nextInt();
        System.out.println("Моля, въведете вашата възраст: ");
        int age = in.nextInt();

        double taxesWorker = 0;
        double taxesFirm = 0;

        if (monthlySalary < 3000 && age <= 55){
            taxesWorker = monthlySalary * 0.2;
            taxesFirm = monthlySalary * 0.17;
            System.out.println("Таксите за работник: " + taxesWorker + "\nТаксите за работодател: " + taxesFirm);
        }
        else if (monthlySalary < 3000 && (age > 55 && 60 >= age)){
            taxesWorker = monthlySalary * 0.13;
            taxesFirm = monthlySalary * 0.13;
            System.out.println("Таксите за работник: " + taxesWorker + "\nТаксите за работодател: " + taxesFirm);
        }

        else if (monthlySalary < 3000 && (age > 60 && 65 >= age)){
            taxesWorker = monthlySalary * 0.075;
            taxesFirm = monthlySalary * 0.09;
            System.out.println("Таксите за работник: " + taxesWorker + "\nТаксите за работодател: " + taxesFirm);
        }

        else if (monthlySalary < 3000 && age > 65){
            taxesWorker = monthlySalary * 0.05;
            taxesFirm = monthlySalary * 0.075;
            System.out.println("Таксите за работник: " + taxesWorker + "\nТаксите за работодател: " + taxesFirm);
        }

        else if (monthlySalary > 3000) {     
            taxesWorker = 3000 * 0.2;
            taxesFirm = 3000 * 0.2;
            System.out.println("Таксите за работник: " + taxesWorker + "\nТаксите за работодател: " + taxesFirm);
        }
        in.close();
    }
}
