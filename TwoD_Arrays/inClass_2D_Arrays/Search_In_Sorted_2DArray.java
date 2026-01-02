package CodeForDSA.TwoD_Arrays.inClass_2D_Arrays;
import java.util.*;

public class Search_In_Sorted_2DArray {
    public static boolean StairCase_Search(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;

        while ( ( row < matrix.length ) && ( col >= 0 ) ) {
            
            if( matrix[row][col] == key ){
                System.out.println("Found key at index = (" + row + "," + col + ")");
                return true;
            } 

            else if ( key < matrix[row][col] ){
                col--;
            } else {
                row++;
            }
        }

        System.out.println("Key not found!");
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int matrix[][] = { {10, 20, 30, 40},
                           {15, 25, 35, 45},
                           {27, 29, 37, 48},
                           {32, 33, 39, 50} };

        System.out.print("Enter the key = ");
        int key = sc.nextInt();

        StairCase_Search(matrix, key);
    }
}
