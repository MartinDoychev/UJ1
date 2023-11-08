/*Нека напишем програма, която конвертира между 8 метрични единици: m, mm, cm, mi, in, km, ft, yd.
Ето таблицата за конвертиране на 1 meter (m):
1000 millimeters (mm)
100 centimeters (cm)
0.000621371192 miles (mi)
39.3700787 inches (in)
0.001 kilometers (km)
3.2808399 feet (ft)
1.0936133 yards (yd)
Програмата трябва да очаква от потребителя да въведе следните данни:
дължината, която трябва да се конвертира
нейната метрична единица
към коя метрична единица да се конвертира
Ако не е валидна матрична единица отпечатайте грешка и излезте от програмата */
import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Моля, въведете дължина: ");
        double value = in.nextDouble();

        System.out.println("Нейната метрична единица: ");
        String from = in.next().toLowerCase();

        System.out.println("Към коя метрична единица да се конвертира? ");
        String to = in.next().toLowerCase();

        if("mm".equals(from)){
            value = value / 1000;
        }
        else if ("cm".equals(from)){
            value = value / 100;
        }
        else if ("mi".equals(from)){
            value = value / 0.000621371192;
       }
        else if ("in".equals(from)){
            value = value / 39.3700787;
       }
        else if ("km".equals(from)){
            value = value / 0.001;
       }
        else if ("ft".equals(from)){
            value = value / 3.2808399;
       } else if ("yd".equals(from)){
            value = value / 1.0936133;
       }
       else if (! "m".equals(from)){
        System.out.printf("Невалидни данни! %s%n", from);
        in.close();
        return;
    }
    System.out.printf("Резултатът е %.5f%n", value);
    in.close();
    }
    
}
