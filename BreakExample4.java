public class BreakExample4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    System.out.println("Breaking inner loop at j = " + j);
                    break;  // breaks inner loop only
                }
                System.out.println("i = " + i + ", j = " + j);
            }
            System.out.println("Outer loop continues...\n");
        }
    }
}
