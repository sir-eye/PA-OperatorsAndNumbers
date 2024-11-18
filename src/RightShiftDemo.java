public class RightShiftDemo {
    public static void main(String[] args) {
        int x = 150;
        System.out.println("Original x in binary: " + Integer.toBinaryString(x));

        x = x >> 2;
        System.out.println("Shifted x (decimal): " + x);
        System.out.println("Shifted x (binary): " + Integer.toBinaryString(x));

        x = 225;
        System.out.println("\nOriginal x in binary: " + Integer.toBinaryString(x));
        x = x >> 2; // Predicted: 56 (binary: 111000)
        System.out.println("Shifted x (decimal): " + x);
        System.out.println("Shifted x (binary): " + Integer.toBinaryString(x));

        x = 1555;
        System.out.println("\nOriginal x in binary: " + Integer.toBinaryString(x));
        x = x >> 2; // Predicted: 388 (binary: 110000100)
        System.out.println("Shifted x (decimal): " + x);
        System.out.println("Shifted x (binary): " + Integer.toBinaryString(x));

        x = 32456;
        System.out.println("\nOriginal x in binary: " + Integer.toBinaryString(x));
        x = x >> 2; // Predicted: 8114 (binary: 1111110110010)
        System.out.println("Shifted x (decimal): " + x);
        System.out.println("Shifted x (binary): " + Integer.toBinaryString(x));
    }
}
