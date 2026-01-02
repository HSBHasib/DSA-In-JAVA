package CodeForDSA.Methods.inClassWork_Methods;
import java.util.*;

public class DecToBin {

    public static void DecToBin(int DecNum){
        int orgDecNum = DecNum;
        int binNum = 0;
        int pow = 0;

        while( DecNum != 0 ){

            int rem = DecNum % 2;
            binNum += (rem * (int)Math.pow(10, pow));

            pow++;
            DecNum /= 2;
        }

        System.out.print("Binary form of " + orgDecNum + " = " + binNum );

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Decimal to Binary [Convertion]
        System.out.print("Enter any Decimal number = ");
        int DecNum = sc.nextInt();

        DecToBin(DecNum);
    }
    
}
