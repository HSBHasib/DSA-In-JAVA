package CodeForDSA.Bit_Manipulation.inClass_Bit_Manipulation.Multiple_Operation_On_IthBit;
import java.util.*;

public class Get_Ith_Bit {
    
    public static int getIthBit(int num, int i) {
        int bitMask = 1<<i;

        if( (num & bitMask) == 0 ){
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number = ");
        int num = sc.nextInt();

        System.out.print("Enter the value of i = ");
        int i = sc.nextInt();

        int getIntBit = getIthBit(num,i);
        System.out.println(i + " number of bit is = " + getIntBit);
    }   

}
