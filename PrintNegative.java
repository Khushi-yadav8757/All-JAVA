import java.util.Scanner;
public class PrintNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size  :");
        int n = sc.nextInt();
         int [] arr = new int[n];
         System.out.print("Enter the Array Element :");
         for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        // printing negative value
         for(int i=0;i<n;i++)
            if(arr[i]<0)//for negative
            System.out.print(arr[i]+"  ");
    }
}
