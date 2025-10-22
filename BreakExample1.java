public class BreakExample1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                System.out.println("Number 7 found! Stopping loop.");
                break;
            }
            System.out.println("Number: " + i);
        }
    }
}
