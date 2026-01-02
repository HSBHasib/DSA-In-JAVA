package CodeForDSA.Methods.inClassWork_Methods;

import java.util.Scanner;

public class BinoCeoff {

    public static int facOfN(int n) {
        int fac = 1;

        for(int i=1; i<=n; i++){
            fac *= i;
        }
        return fac;
    }
    
    
    public static void BinomialCeofficient(int n, int r) {
        int fac_n = facOfN(n);
        int fac_r = facOfN(r);
        int fac_nmr = facOfN(n-r);

        int binoCeoff = fac_n / (fac_r * fac_nmr);
        System.out.println(binoCeoff);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Calc Factorial of N
        // System.out.print("Enter the Range of Factorial : ");
        // int n = sc.nextInt();

        // facOfN(n);



        // Calc BinomialCeofficient
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of R : ");
        int r = sc.nextInt();

        BinomialCeofficient(n , r);

    }
    
}
