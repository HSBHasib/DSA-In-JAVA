package CodeForDSA.Recursion.Recursion1.inClassWork_Recursion1;
import java.util.*;

public class x_ToThePower_n_OP {

    // Optimize Way
    public static int x_toThePower_n(int x, int n) { // O(logn)
        if( n == 0 ) return 1;

        int halfPower = x_toThePower_n(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        // n is Odd
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq; 
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
