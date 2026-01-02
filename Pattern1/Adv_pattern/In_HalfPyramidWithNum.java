package CodeForDSA.Pattern1.Adv_pattern;
import java.util.*;

public class In_HalfPyramidWithNum {

    public static void In_HalfPyramid(int totRows) {

        for(int i=1; i<=totRows; i++){     
            // STAR
            for(int j=1; j<=totRows-i+1; j++){
                System.out.print(j);
            }

            System.out.println();
        }

    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows values = ");
        int totRows = sc.nextInt();
        
        In_HalfPyramid(totRows);

    }
    
}
