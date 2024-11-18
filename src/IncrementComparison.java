public class IncrementComparison {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        int sum;

        sum = ++x + y;
        System.out.println("Using prefix increment, sum: " + sum);
        x = 5;
        sum = x++ + y;
        System.out.println("Using postfix increment, sum: " + sum);
    }
}
