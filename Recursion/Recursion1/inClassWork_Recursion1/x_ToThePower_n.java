package CodeForDSA.Recursion.Recursion1.inClassWork_Recursion1;
import java.util.*;

public class x_ToThePower_n {

    // Brute Case
    public static int x_toThePower_n(int x, int n) {
        if( n == 0 ) return 1;

        int xnm1 = x_toThePower_n(x, n-1);
        int x_toThePower_n = x * xnm1;

        return x_toThePower_n; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base value of X : ");
        int x = sc.nextInt();
        
        System.out.print("Enter the Power of X value : ");
        int n = sc.nextInt();
        
        int x_toThePower_n = x_toThePower_n(x, n);
        System.out.println(x + " to the power " + n + " = " + x_toThePower_n);

    }    
}
