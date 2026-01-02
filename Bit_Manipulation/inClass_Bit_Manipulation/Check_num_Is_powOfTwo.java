package CodeForDSA.Bit_Manipulation.inClass_Bit_Manipulation;
import java.util.*;

public class Check_num_Is_powOfTwo {

    public static boolean isPowOfTwo(int num) {
        return (num & (num-1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number = ");
        int num = sc.nextInt();

        if( isPowOfTwo(num)){
            System.out.println(num + " is a Power of two");
        } else {
            System.out.println(num + " is not a Power of two");
        }


    }    
}
