package CodeForDSA.Strings.inClass_Strings;
import java.util.*;

public class Largest_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Array = ");
        int arrSize = sc.nextInt();

        String fruits[] = new String[arrSize];

        for(int i=0; i<fruits.length; i++){
            System.out.print("Enter the " + (i+1) + " Fruits Name : ");
            fruits[i] = sc.next();
        }
        
        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++){
            if ( largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        System.out.println("The largest fruitsName is : " + largest);

        


        // String fruits[] = {"mango", "apple", "banana"};
    
        // String largest = fruits[0];
        // for(int i=1; i<fruits.length; i++){
        //     if( largest.compareTo(fruits[i]) < 0 ){
        //         largest = fruits[i];
        //     }
        // }



    }    
}
