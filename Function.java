//Java Program Using a Function to Add Two Numbers.

public class AddNumbers {
    // Function to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        
        int result = add(num1, num2);      // Call the function and store the result

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);      // Display the result
    }
}
