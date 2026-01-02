package CodeForDSA.Arrays.Arrays1.inClass_Arrays;
import java.util.*;

public class LinearSearch {

    public static int LinearSearch(int number[], int n, int key) {
        
        for(int i=0; i<number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
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

        System.out.print("Enter the target number that you want to search in Array = ");
        int key = sc.nextInt();


        int keyValue = LinearSearch(number, n, key);

        if( keyValue == -1 ){
            System.out.println("Target number is missing");
        } else {
            System.out.println("Find the target number at index = " + keyValue);
        }

    }
    
}
