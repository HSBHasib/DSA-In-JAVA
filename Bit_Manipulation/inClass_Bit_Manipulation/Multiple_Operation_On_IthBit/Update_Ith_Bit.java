package CodeForDSA.Bit_Manipulation.inClass_Bit_Manipulation.Multiple_Operation_On_IthBit;
import java.util.*;

public class Update_Ith_Bit {

    public static int setIthBit(int num, int i) {
        int bitMask = 1<<i;

        return (num | bitMask);
        
    }

    public static int clearIthBit(int num, int i) {
        int bitMask = ~(1<<i);

        return (num & bitMask);
        
    }
    
    public static int updateIthBit(int num, int i, int newBit) {

        // 1st way to Update ith_bit
        // if( newBit == 0 ){
        //     clearIthBit(num, bitMask);
        // } else {
        //     setIthBit(num, bitMask);
        // }

        // 2nd way to Update ith_bit
        num = clearIthBit(num, i);
        int BitMask = newBit<<i;
        return num | BitMask;

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number = ");
        int num = sc.nextInt();

        System.out.print("Enter the value of i = ");
        int i = sc.nextInt();

        System.out.print("Enter newBit value = ");
        int newBit = sc.nextInt();

        int updateIthBit = updateIthBit(num, i, newBit);
        System.out.println(updateIthBit);
        
        // updateIthBit(num, i, newBit);
    }   

}
