package CodeForDSA.Bit_Manipulation.inClass_Bit_Manipulation;
import java.util.*;

public class Count_Set_Bits {

    public static int count_SetBits(int num) {
        int count = 0;        
        while ( num != 0 ) {

            if( (num & 1) != 0 ){
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number = ");
        int num = sc.nextInt();

        int count_SetBits = count_SetBits(num);
        System.out.println("Total Set bits is = " + count_SetBits);


    }    
}
