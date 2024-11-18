public class BitwiseDemo {
    public static void main(String[] args) {
        int x = 7;  // Binary: 0111
        int y = 17; // Binary: 10001

        int z = x & y;
        System.out.println("Bitwise AND result (decimal): " + z);
        System.out.println("Bitwise AND result (binary): " + Integer.toBinaryString(z));

        z = x | y;
        System.out.println("Bitwise OR result (decimal): " + z);
        System.out.println("Bitwise OR result (binary): " + Integer.toBinaryString(z));
    }
}
