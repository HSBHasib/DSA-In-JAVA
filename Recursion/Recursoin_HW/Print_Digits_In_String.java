package CodeForDSA.Recursion.Recursoin_HW;
import java.util.*;

public class Print_Digits_In_String {

    static String digit[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void print_Digits_In_String(int n) {
        if( n == 0 ) {
            return;
        }

        int lastDigit = n % 10;
        print_Digits_In_String(n/10);

        System.out.print(digit[lastDigit] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number = ");
        int n = sc.nextInt();

        print_Digits_In_String(n);
    }    
}
