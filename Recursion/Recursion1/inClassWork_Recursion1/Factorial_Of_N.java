package CodeForDSA.Recursion.Recursion1.inClassWork_Recursion1;
import java.util.*;

public class Factorial_Of_N {

    public static int fac_Of_N(int n) { 
        if( n == 0 ){
            return 1;
        }
        
        int fnm1 = fac_Of_N(n-1);
        int fn = n * fnm1;
        return fn;   
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        System.out.println(fac_Of_N(n));
    }    
}
