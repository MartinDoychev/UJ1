/*Събрали сме плодове, направили сме си джибри и сега е време да преценим кога е най- добрият момент, в който да отидем до казана и да получим дълго чаканата си домашна ракийка.
Знаем, че процесът на ферментация е свързан с бактерии, които преработват захарта в алкохол. 
Освен тези приятни бактерии обаче, има и едни други, не толкова дружелюбни бактерии, които преобразуват алкохола в оцет.
Ако приемем, че в началото на процеса имаме 100% захар. За един ден бактериите преобразуват 10% (от наличната захар) в алкохол и 1% от алкохола в оцет.
След колко дни трябва да отидем до казана, така че да получим възможно най-много алкохол? */
public class Rakia {
    public static void main(String[] args) {
        double sugar = 100.0;
        double alcohol = 0.0;
        int bestDay = 0;
        double maxAlcohol = 0.0;

        for(int day = 1; day <= 30; day++){
            double convertedToAlcohol = 0.1 * sugar;
            double convertedToVinegar = 0.01 * alcohol;

            alcohol += convertedToAlcohol - convertedToVinegar;
            sugar -= 0.1 * sugar;

            if(alcohol > maxAlcohol){
                maxAlcohol = alcohol;
                bestDay = day;
            }
        }
        System.out.println("След " + bestDay + " дни ще получите най-голямото количество алкохол.");
    }
}
