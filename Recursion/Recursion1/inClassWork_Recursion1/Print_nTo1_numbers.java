package CodeForDSA.Recursion.Recursion1.inClassWork_Recursion1;
import java.util.*;

public class Print_nTo1_numbers {

    public static void print_nTo1_AllNumbers(int n) {
        if( n == 1 ){
            System.out.print(n);
            return;
        }
        
        System.out.print(n + " ");
        print_nTo1_AllNumbers(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        print_nTo1_AllNumbers(n);
    }    
}
