package CodeForDSA.TwoD_Arrays.inClass_2D_Arrays;
import java.util.*;

public class Spiral_Matrix {
    public static void Print_Spiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while ( ( startRow <= endRow ) && ( startCol <= endCol ) ) {
            // Top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }

            // Right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.println(matrix[i][endCol] + " ");
            }
            
            // Bottom
            for(int j=endCol-1; j>=startCol; j--){
                if( startRow == endRow ){
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            
            // Left
            for(int i=endRow-1; i>=startRow+1; i--){
                if( startCol == endCol ){
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int matrix[][] = { {1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 10, 11, 12},
                           {13, 14, 15, 16} };

        Print_Spiral(matrix);
            
    }
    
}
