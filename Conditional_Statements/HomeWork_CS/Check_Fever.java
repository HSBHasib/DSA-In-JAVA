package CodeForDSA.Conditional_Statements.HomeWork_CS;
import java.util.*;

public class Check_Fever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    /* [ Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever. ]  

        Given : double temp = 103.5;
    */

        System.out.print("Enter Temperature : ");
        double temp = sc.nextDouble();

        if( temp > 100 ) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You don't have a fever");
        }
    }    
}
