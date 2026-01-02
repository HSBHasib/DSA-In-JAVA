package CodeForDSA.Methods.inClassWork_Methods;
import java.util.*;

public class BinaryToDec {

    public static void BinaryToDec(int binNum){
        int orgBinNum = binNum;
        int dec = 0;
        int pow = 0;

        while( binNum != 0 ){

            int lastDigit = binNum % 10;
            dec += (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum /= 10;
        }

        System.out.print("Decimal of " + orgBinNum + " = " + dec );

    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        // Binary to Decimal [Convertion]
        System.out.print("Enter any Binary number : ");
        int binNum = sc.nextInt();

        BinaryToDec(binNum);
    }
    
}
