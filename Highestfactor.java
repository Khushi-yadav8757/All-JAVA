import java.util.Scanner;
public class Highestfactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int  n = sc.nextInt();
        int hf =1 ;
        for(int i=1;i<=n;i++){                // highest factor except the n itself use this for(int i=1;i<n;i++)
            if(n%i==0)
            hf = i ;
        }
        System.out.println(hf);    
    
    }
}
