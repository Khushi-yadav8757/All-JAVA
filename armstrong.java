// Armstrong Number
Check if a number is Armstrong (e.g., 153 → 1³ + 5³ + 3³ = 153) //
public class Armstrong {
    public static void main(String[] args) {
        int num = 153, temp = num, sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        if (sum == num)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
