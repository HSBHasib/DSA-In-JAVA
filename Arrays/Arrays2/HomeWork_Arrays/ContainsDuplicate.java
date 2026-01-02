package CodeForDSA.Arrays.Arrays2.HomeWork_Arrays;
import java.util.*;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int number[]) {
     
        for(int i=0; i<number.length-1; i++){
            for(int j=i+1; j<number.length; j++){
                if(number[i] == number[j]){
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of Array
        System.out.print("Enter the size of Array = ");
        int n = sc.nextInt();

        int number[] = new int[n];

        // Input the value of Array
        for(int i=0; i<number.length; i++){
            System.out.print("Enter the value of index " + i +  " = ");
            number[i] = sc.nextInt();
        }

        boolean checkDuplicateNum = containsDuplicate(number);
        System.out.println(checkDuplicateNum);

    }
    
}
