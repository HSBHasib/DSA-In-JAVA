package CodeForDSA.Recursion.Recursion2.HomeWork_Recursion2;
import java.util.*;

public class Kth_Grammer {

    public static int kth_Grammer(int n, int k) {
        
        if( k == 1 ){
            return 0;
        }

        int parent = kth_Grammer(n-1, (k+1)/2);

        if( parent == 0 ){

            if( k%2 == 1 ){
                return 0;
            } else {
                return 1;
            }

        } else {

            if( k%2 == 1 ){
                return 1;
            } else {
                return 0;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(kth_Grammer(4, 2));

    }
}
