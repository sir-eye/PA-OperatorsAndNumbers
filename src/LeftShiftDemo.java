public class LeftShiftDemo {
    public static void main(String[] args) {
        int x = 2;
        System.out.println("Original x in binary: " + Integer.toBinaryString(x));

        x = x << 1;
        System.out.println("Shifted x (decimal): " + x);
        System.out.println("Shifted x (binary): " + Integer.toBinaryString(x));

        x = 9;
        System.out.println("\nOriginal x in binary: " + Integer.toBinaryString(x));
        x = x << 1; // Predicted: 18 (binary: 10010)
        System.out.println("Shifted x (decimal): " + x);
        System.out.println("Shifted x (binary): " + Integer.toBinaryString(x));

        x = 17;
        System.out.println("\nOriginal x in binary: " + Integer.toBinaryString(x));
        x = x << 1; // Predicted: 34 (binary: 100010)
        System.out.println("Shifted x (decimal): " + x);
        System.out.println("Shifted x (binary): " + Integer.toBinaryString(x));

        x = 88;
        System.out.println("\nOriginal x in binary: " + Integer.toBinaryString(x));
        x = x << 1; // Predicted: 176 (binary: 10110000)
        System.out.println("Shifted x (decimal): " + x);
        System.out.println("Shifted x (binary): " + Integer.toBinaryString(x));
    }
}
