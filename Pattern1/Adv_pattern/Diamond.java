package CodeForDSA.Pattern1.Adv_pattern;
import java.util.*;

public class Diamond {

    public static void DiamondPattern(int totRows) {
        
        // Upper_Part
        for(int i=1; i<=totRows; i++){
            // Right_SPC
            for(int j=1; j<=totRows-i; j++){
                System.out.print(" ");
            }

            // 1st way to Print '*'
            for(int j=1; j<=2*i-1; j++){

                System.out.print("*");
                
            }


            // // 2nd way to Print '*'
            // // Lest_STAR
            // for(int j=1; j<=i; j++){
            //     System.out.print("*");
            // }

            // // Right_STAR
            // for(int j=2; j<=i; j++){

            //     System.out.print("*");
            // }


            System.out.println();
        }
        


        // Lower_Part
        for(int i=totRows; i>=1; i--){
            // Right_SPC
            for(int j=1; j<=totRows-i; j++){
                System.out.print(" ");
            }

            // 1st way to Print '*'
            for(int j=1; j<=2*i-1; j++){
                
                System.out.print("*");

            }

            // // 2nd way to Print '*'
            // // Lest_STAR
            // for(int j=1; j<=i; j++){
            //     System.out.print("*");
            // }

            // // Right_STAR
            // for(int j=2; j<=i; j++){
            //     System.out.print("*");
            // }

            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter the rows values = ");
        int totRows = sc.nextInt();
    
        DiamondPattern(totRows);

        
    }

    
}


