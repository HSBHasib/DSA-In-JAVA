package CodeForDSA.Bit_Manipulation.inClass_Bit_Manipulation.Multiple_Operation_On_IthBit;
import java.util.*;

public class Clear_RangeOfBits {
    
    public static int clear_RangeOfBits(int num, int i, int j) {

        int a = (~0) << (j+1);
        int b = (1<<i) - 1; // ( 1 to the power i) - 1;

        int bitMask = a | b;
        return num & bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number = ");
        int num = sc.nextInt();

        System.out.print("Enter the value of i = ");
        int i = sc.nextInt();

        System.out.print("Enter the value of j = ");
        int j = sc.nextInt();

        int clearRangeBits = clear_RangeOfBits(num, i, j);
        System.out.println(clearRangeBits);

    }   

}



