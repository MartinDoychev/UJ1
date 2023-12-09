class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}

class Adder extends Arithmetic {
    
}
