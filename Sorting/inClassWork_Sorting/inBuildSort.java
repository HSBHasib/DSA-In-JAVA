package CodeForDSA.Sorting.inClassWork_Sorting;
import java.util.*;

public class inBuildSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    {
        int number[] = {5, 3, 1, 4, 7, 12, 10, 2, 6};
        
        // full array sorted
        Arrays.sort(number);    // in build method for sorting array
    

    // // We can select the condition kon range porjonto arrays sort korte cai.
    // // first fromIndex value dibo than toIndex value koto theke koto index porjonto array sort korbo
        
    

        Arrays.sort(number, 0, 4);

        System.out.print("[ ");
        for(int i=0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.print("]");


        System.out.println();
    }


    {

        Integer number[] = {12, 10, 8, 11, 9, 7, 8, 6};

        // full array Reverse & sorted
        Arrays.sort(number, Collections.reverseOrder());
        
        // [ .... ]
        Arrays.sort(number,0, 4, Collections.reverseOrder());

        System.out.print("[ ");
        for(int i=0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println("]");

    }    



    }    
}
