package CodeForDSA.Recursion.Recursion1.inClassWork_Recursion1;
import java.util.*;

public class Fibonacci {

    public static int fibonacci(int n) { 
        if( n == 0 || n == 1 ){
            return n;
        }
    
        int fnm1 = fibonacci(n-1);
        int fnm2 = fibonacci(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        System.out.println(fibonacci(n));
    }
}