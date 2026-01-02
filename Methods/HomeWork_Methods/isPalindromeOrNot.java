package CodeForDSA.Methods.HomeWork_Methods;
import java.util.*;

public class isPalindromeOrNot {

    public static void isPalindrome(int number) {
        int orgNum = number;
        int revNum = 0;

        while( number != 0 ){
            int lastDigit = number % 10;
            revNum = (revNum * 10) + lastDigit;

            number /= 10;
        }
            
        if( orgNum == revNum){
            System.out.println(orgNum + " is a Palindrome");
        } else {
            System.out.println(orgNum + " is not a Palindrome");
        }

    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // HomeWork Question 3 => [ Write a Java program to check if a number is a palindrome in Java? (121 is a palindrome, 321 is not) ]
    
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
            
        isPalindrome(n);

    }
}
