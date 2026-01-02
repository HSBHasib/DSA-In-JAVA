package CodeForDSA.Pattern1.Adv_pattern;
import java.util.*;

public class AdvancePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        // // Question 10 => [ NUMBER PYRAMID Pattern ]

        int n = 5;

        for(int i=1; i<=n; i++){
            // SPC
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // Number
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }

            System.out.println();
        }


    }
}
