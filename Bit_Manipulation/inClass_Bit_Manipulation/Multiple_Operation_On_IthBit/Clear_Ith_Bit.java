package CodeForDSA.Bit_Manipulation.inClass_Bit_Manipulation.Multiple_Operation_On_IthBit;
import java.util.*;

public class Clear_Ith_Bit {
    
    public static int clearIthBit(int num, int i) {
        int bitMask = ~(1<<i);

        return num & bitMask;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number = ");
        int num = sc.nextInt();

        System.out.print("Enter the value of i = ");
        int i = sc.nextInt();

        int clearIntBit = clearIthBit(num,i);
        System.out.println(clearIntBit);
    }   

}
