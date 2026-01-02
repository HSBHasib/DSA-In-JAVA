package CodeForDSA.TwoD_Arrays.HomeWork_2D_Arrays;
import java.util.*;

public class Print_2DArray_RowSum {

    public static void RowSum(int matrix[][]) {
        int sum = 0;

        for(int j=0; j<matrix.length; j++){
           sum += matrix[1][j];
        }
        System.out.println("Sum of Second line of Row is = " + sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = { {10, 20, 30, 40},
                           {1, 1, 1, 1},
                           {1, 29, 37, 48},
                           {1, 33, 39, 50} };
        
        RowSum(matrix);

    }    
}


