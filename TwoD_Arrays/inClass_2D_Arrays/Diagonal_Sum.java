package CodeForDSA.TwoD_Arrays.inClass_2D_Arrays;
import java.util.*;

public class Diagonal_Sum {

    public static int Diagonal_Sum_BruteF(int matrix[][]) {
        int sum = 0;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){

                // Primary_Diagonal
                if( i == j ){
                    sum += matrix[i][j];
                }
                // Secondary_Diagonal
                else if( i+j == matrix.length-1 ){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;

    }
    
    public static int Diagonal_Sum_OptimizeCode(int matrix[][]) {
        int sum = 0;

        for(int i=0; i<matrix.length; i++){
            // Primary_Diagonal
            sum += matrix[i][i];

            // Secondary_Diagonal
            if( i != matrix.length-1-i ){
                sum += matrix[i][matrix.length-1-i];
            } 
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int matrix[][] = { {1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 10, 11, 12},
                           {13, 14, 15, 16} };

        System.out.println("Brute_Diagonal Sum = " + Diagonal_Sum_BruteF(matrix));
        System.out.println("Optimize_Diagonal Sum = " + Diagonal_Sum_OptimizeCode(matrix));


            
    }
}
