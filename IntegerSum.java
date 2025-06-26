import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();  // Take first integer input

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();  // Take second integer input

        int sum = num1 + num2;  // Add the numbers

        System.out.println("The sum is: " + sum);  // Display result

        sc.close();  // Close scanner
    }
}
