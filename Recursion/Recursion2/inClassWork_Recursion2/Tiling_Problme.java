package CodeForDSA.Recursion.Recursion2.inClassWork_Recursion2;
import java.util.*;

public class Tiling_Problme {

    public static int tiling_Problme(int n) {
        if( n == 0 || n == 1 ){
            return 1;
        }

        // vertical choice
        int fnm1 = tiling_Problme(n-1);

        // horizontal choice
        int fnm2 = tiling_Problme(n-2);

        int totWays = fnm1 + fnm2;
        return totWays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        int totWays = tiling_Problme(n);
        System.out.println("" + totWays);

    }    
}
