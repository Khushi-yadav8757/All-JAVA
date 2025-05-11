import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Kitne elements chahiye? ");
        int n = sc.nextInt(); 

        int[] arr = new int[n]; 

        
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        
        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
