/*Направете програма BMI, с която да изчислите моя Body Mass Index. Аз тежа 80кг и съм висок 171см. 
Ако съм съм надвишил малко теглото и съм Overweight напишете на екрана more training, less eating, ако не съм – напишете you rock! */

public class BMI{
    public static void main(String[] args) {
        double weight = 80;
        double height = 1.71;
        double bmi = weight / (Math.pow(height,2));   
        
        System.out.println((bmi < 25) ? "you rock " : "more training, less eating");

    }
}