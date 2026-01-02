package CodeForDSA.Recursion.Recursion1.inClassWork_Recursion1;
import java.util.*;

public class Sum_Of_N {

    public static int calcSum(int n) { 
        if( n == 1 ){
            return 1;
        }
        
        int snm1 = calcSum(n-1);
        int sumOfN = n + snm1;
        return sumOfN;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        System.out.println(calcSum(n));
    }
}