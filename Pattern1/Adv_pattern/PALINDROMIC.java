package CodeForDSA.Pattern1.Adv_pattern;
import java.util.*;

public class PALINDROMIC {

    public static void PalindromicPattern(int totRows) {
        
       for(int i=1; i<=totRows; i++){
            // SPC
            for(int j=1; j<=totRows-i; j++){
                System.out.print("  ");
            }

            // Left_Number
            for(int j=i; j>=1; j--){
                System.out.print(j + " ");
            }

            // // Right_Number
            for(int j=2; j<=i; j++){
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter the rows values = ");
        int totRows = sc.nextInt();
    
        PalindromicPattern(totRows);
        

        
    }

    
}




