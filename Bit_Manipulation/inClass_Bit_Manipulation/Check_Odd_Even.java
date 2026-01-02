package CodeForDSA.Bit_Manipulation.inClass_Bit_Manipulation;
import java.util.*;

public class Check_Odd_Even {

    public static void check_Odd_Even(int num) {
        int bitMask = 1;

        if( (num & bitMask) == 0 ){
            System.out.println("Even Number");
        } else {
            System.out.println(" Odd Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number = ");
        int num = sc.nextInt();

        check_Odd_Even(num);
    }    
}
