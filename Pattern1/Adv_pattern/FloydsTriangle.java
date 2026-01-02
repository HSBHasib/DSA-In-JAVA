package CodeForDSA.Pattern1.Adv_pattern;
import java.util.*;

public class FloydsTriangle {

    public static void FloydsTriangle(int totRows) {

        int count = 1;
        for(int i=1; i<=totRows; i++){     
            // STAR
            for(int j=1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }

            System.out.println();
        }

    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows values = ");
        int totRows = sc.nextInt();
        
        FloydsTriangle(totRows);

    }
    
}





