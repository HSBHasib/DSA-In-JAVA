package CodeForDSA.Conditional_Statements.HomeWork_CS;
import java.util.*;

public class Check_LeapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

    // [ Write a Java program that takes a year from the user and print whether that year is a leap year or not.

        System.out.print("Enter the year : ");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0 ;
        boolean y = (year % 100) != 0 ;
        boolean z = (year % 100 == 0) && (year % 400 == 0) ;

        if( x && (y || z)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println( year + " is  not Leap Year");
        }

    }
    
}
