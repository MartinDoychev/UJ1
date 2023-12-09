import java.util.Random;

class CustomRandom extends Random {
    double getRandomDoubleInRange(double a, double b) {
        return a + (b - a) * nextDouble();
    }
}