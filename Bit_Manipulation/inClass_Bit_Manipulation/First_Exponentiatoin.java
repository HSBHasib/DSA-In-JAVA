package CodeForDSA.Bit_Manipulation.inClass_Bit_Manipulation;
import java.util.*;

public class First_Exponentiatoin {

    public static int first_Exponentiatoin(int num , int pow) {
        int ans = 1;

        while ( pow > 0 ) {

            if( (pow & 1) != 0 ){
                ans *= num;
                System.out.println("Answer value = " + ans);
            }
            num *= num;
            System.out.print("Number value = " + num);
            pow = pow >> 1;
            System.out.println(" , Power value = " + pow);

        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number = ");
        int num = sc.nextInt();
        
        System.out.print("Enter Power of num = ");
        int pow = sc.nextInt();


        int first_Exponentiatoin = first_Exponentiatoin(num, pow);
        System.out.println(num + " to the Power " + pow + " is = " + first_Exponentiatoin);

    }    
}
