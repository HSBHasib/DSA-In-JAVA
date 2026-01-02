package CodeForDSA.Recursion.Recursion1.inClassWork_Recursion1;
import java.util.*;

public class Print_1Ton_numbers {

    // First Way to solve this Question
    public static void oneWay_print_1Ton_AllNumbers(int n1) {
        if( n1 == 10 ){
            System.out.print(n1);
            return;
        }
        
        System.out.print(n1 + " ");
        oneWay_print_1Ton_AllNumbers(n1 + 1);
    }

    // Second Way to solve this Question
    public static void secWay_print_1Ton_AllNumbers(int n2) {
        if( n2 == 1 ){
            System.out.print(n2);
            return;
        }
        
        secWay_print_1Ton_AllNumbers(n2 - 1);
        System.out.print(" " + n2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = 1;
        oneWay_print_1Ton_AllNumbers(n1);
        
        System.out.println();
        
        int n2 = 10;
        secWay_print_1Ton_AllNumbers(n2);
    }    
}
