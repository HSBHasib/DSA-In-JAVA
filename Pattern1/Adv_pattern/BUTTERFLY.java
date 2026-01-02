package CodeForDSA.Pattern1.Adv_pattern;
import java.util.*;

public class BUTTERFLY {

    public static void Butterfly(int totRows) {
        
        // For Upper_Part
        for(int i=1; i<=totRows; i++){

            //left STAR
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // Right SPC
            for(int j=1; j<=2*(totRows-i); j++){
                System.out.print(" ");
            }

            //Right STAR
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

         // For Lower_Part
        for(int i=totRows; i>=1; i--){
            
            //left STAR
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // Right SPC
            for(int j=1; j<=2*(totRows-i); j++){
                System.out.print(" ");
            }

            //Right STAR
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter the rows values = ");
        int totRows = sc.nextInt();
    
        Butterfly(totRows);

        
    }

    
}



