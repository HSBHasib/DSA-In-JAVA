package CodeForDSA.TwoD_Arrays.HomeWork_2D_Arrays;
import java.util.*;

public class Count_TargetValue {

    public static void Count_TargetValue(int matrix[][], int key) {
        
        int count = 0;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if( key == matrix[i][j] ){
                    count++;
                }
            }
        }

        System.out.println("Key value found in the Array - (" + count + " times)");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = { {10, 20, 30, 40},
                           {15, 25, 35, 45},
                           {27, 29, 37, 48},
                           {32, 33, 39, 50} };

        System.out.print("Enter the key = ");
        int key = sc.nextInt();
        
        Count_TargetValue(matrix, key);

    }    
}
