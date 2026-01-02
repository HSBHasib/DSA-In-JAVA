package CodeForDSA.Methods.HomeWork_Methods;
import java.util.*;

public class isEvenOrNot {

    public static boolean isEven(int n) {
            
        if( n % 2 != 0 ){
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // HomeWork Question 2 => [ Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method.]
    
            System.out.print("Enter any number : ");
            int n = sc.nextInt();
    
            boolean isEven = isEven(n);
            System.out.println(isEven);

    }
}
