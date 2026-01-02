package CodeForDSA.Pattern1.Adv_pattern;
import java.util.*;

public class IR_HalfPyramid {

    public static void In_R_HalfPyramid(int totRows) {

        for(int i=1; i<=totRows; i++){
            // SPC
            for(int j=1; j<=totRows-i; j++){
                System.out.print(" ");
            }
                
            // STAR
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows values = ");
        int totRows = sc.nextInt();
        
        In_R_HalfPyramid(totRows);

    }
    
}
