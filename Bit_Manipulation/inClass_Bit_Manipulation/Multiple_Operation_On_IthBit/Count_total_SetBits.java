package CodeForDSA.Bit_Manipulation.inClass_Bit_Manipulation.Multiple_Operation_On_IthBit;
import java.util.*;

public class Count_total_SetBits {

    public static int count_total_SetBits(int n) {
        int count = 0;

        while(n > 0){

            if( (n & 1) != 0 ) {
                count ++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =10;

        System.out.println(count_total_SetBits(n));
    }    
}
