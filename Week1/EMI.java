/*Приравнена месечна вноска e фиксирана сума за плащане, направена от кредитополучател на кредитор на определена дата всеки календарен месец. Приравнени месечни вноски се използват за изплащане на лихви и главници всеки месец, така че за определен брой години заемът се изплаща изцяло заедно с лихвите.
Годишната вноска се изчислява по формулата:
Където:
P е заетата сума
r е годишната лихва
n е броят на вноските
За да изчислите месечната вноска, трябва да разделите ‘r’ на 12.
Купил съм си апартамент, за който съм заел от банка 10 000 000 евро при годишна лихва 10.5% и смятам да го изплатя за 10 години.
Колко ще е моята месечна вноска?
ИЗПОЛЗВАЙТЕ BigDecimal!
Отпечатайте така: System.out.println(A.setScale(10, RoundingMode.HALF_UP));
Когато използвате метода divide на BigDecimal, го извикайте по следния начин:
import java.math.BigDecimal;
import java.math.RoundingMode; */

import java.math.BigDecimal;
import java.math.RoundingMode;


public class EMI {
    public static void main(String[] args) {

        BigDecimal P = new BigDecimal("10000000");
        BigDecimal r = new BigDecimal("0.105"); 
        BigDecimal n = new BigDecimal("120");

        BigDecimal monthlyInterestRate = r.divide(new BigDecimal("12"), 10, RoundingMode.HALF_UP);
        BigDecimal monthlyPayment = P.divide(n);
        BigDecimal monthlyInterestInMoney = monthlyPayment.multiply(monthlyInterestRate);
        BigDecimal monthlyPaymentWithInterest = P.add(monthlyInterestInMoney);

        System.out.println(monthlyPaymentWithInterest.setScale(10, RoundingMode.HALF_UP)); 
    
    }
    
}
