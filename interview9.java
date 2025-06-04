// Swap Two Numbers Without Third Variable
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a + ", b: " + b); // a: 10, b: 5
    }
}
