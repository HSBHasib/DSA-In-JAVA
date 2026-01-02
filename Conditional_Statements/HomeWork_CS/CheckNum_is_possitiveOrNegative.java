package CodeForDSA.Conditional_Statements.HomeWork_CS;
import java.util.*;

public class CheckNum_is_possitiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    // [ Write a Java program to get a number from the user and print whether it is positive or negative. ]

        System.out.print("Enter any number : ");
        int x = sc.nextInt();

        if( x > 0 ) {
            System.out.println("Number is Positive : " + x);
        } else {
            System.out.println("Number is Negative : " + x);
        }
    }
}
