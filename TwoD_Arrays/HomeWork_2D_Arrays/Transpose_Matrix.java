package CodeForDSA.TwoD_Arrays.HomeWork_2D_Arrays;
import java.util.*;

public class Transpose_Matrix {
    public static void Transpose_Matrix(int matrix[][]){
        
        for(int i=0; i<matrix.length-1; i++){
            for(int j=i+1; j<matrix[0].length; j++){
                // Swap the matrix value
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int matrix[][] = { {10, 20, 30, 40},
                           {15, 25, 35, 45},
                           {27, 29, 37, 48},
                           {32, 33, 39, 50} };

        Transpose_Matrix(matrix);

        // Print the Matrix
        for(int i=0; i<matrix.length; i++){
            System.out.print("{ ");
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("}");
            System.out.println();
        }
    }
}


