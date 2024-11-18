public class IncrementDemo {
    public static void main(String[] args) {
        int value = 5;
        System.out.println("Initial value: " + value);

        value++;
        System.out.println("After ++: " + value);

        value += 1;
        System.out.println("After += 1: " + value);

        value = value + 1;
        System.out.println("After value = value + 1: " + value);
    }
}
