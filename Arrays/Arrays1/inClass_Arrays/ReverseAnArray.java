package CodeForDSA.Arrays.Arrays1.inClass_Arrays;
import java.util.*;

public class ReverseAnArray {

    public static void reverseArray(int number[]) {
        
        int firstIndex = 0, lastIndex = number.length-1;

        while ( firstIndex < lastIndex ) {
               
            int temp = number[lastIndex];
            number[lastIndex] = number[firstIndex];
            number[firstIndex] = temp;
            
            firstIndex++;
            lastIndex--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array = ");
        int n = sc.nextInt();

        int number[] = new int[n];

        for(int i=0; i<number.length; i++){
            System.out.print("Enter the value of index " + i +  " = ");
            number[i] = sc.nextInt();
        }

        reverseArray(number);
        
        for(int i=0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }

    }
    
}
