package CodeForDSA.Pattern1.Adv_pattern;
import java.util.*;

public class SolidRhombus {

    public static void Solid_Rhombus(int totRows) {
        
     
        for(int i=1; i<=totRows; i++){
            // SPC
            for(int j=1; j<=totRows-i; j++){
                System.out.print(" ");
            }

            // STAR
            for(int j=1; j<=totRows; j++){

                if( i == 1 || j == 1 || i == totRows | j == totRows ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter the rows values = ");
        int totRows = sc.nextInt();
    
        Solid_Rhombus(totRows);

        
    }

    
}


