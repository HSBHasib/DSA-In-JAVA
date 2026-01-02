package CodeForDSA.Pattern1.Adv_pattern;
import java.util.*;

public class  zeroOne_Triangle {

    public static void zeroOne_Triangle(int totRows) {
        
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=i; j++){

                if( (i+j) % 2 == 0 ){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter the rows values = ");
        int totRows = sc.nextInt();
    
        zeroOne_Triangle(totRows);

        
    }

    
}

