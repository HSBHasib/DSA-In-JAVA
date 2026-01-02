package CodeForDSA.Bit_Manipulation.inClass_Bit_Manipulation.Multiple_Operation_On_IthBit;
import java.util.*;

public class Clear_Last_I_Bits {
    
    public static int clear_Last_I_Bits(int num, int i) {
        int bitMask = (~0)<<i;
        return (num & bitMask);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number = ");
        int num = sc.nextInt();

        System.out.print("Enter the value of i = ");
        int i = sc.nextInt();

        int clear_Last_I_Bits = clear_Last_I_Bits(num,i);
        System.out.println(clear_Last_I_Bits);
    }   

}
