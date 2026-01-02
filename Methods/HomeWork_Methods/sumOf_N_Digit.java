package CodeForDSA.Methods.HomeWork_Methods;
import java.util.*;

public class sumOf_N_Digit {

    public static void sumOfNum(int num) {
        int orgNum = num;
        int sum = 0;

        while ( num != 0 ) {
            int lastDigit = num % 10;
            sum += lastDigit;

            num /= 10;
        }

        System.out.print("Sum of " + orgNum + " is = " + sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    // // HomeWork Question 4 => [ Write a Java method to compute the sum of the digits in an integer.]
    
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
    
        sumOfNum(n);

    }
}
