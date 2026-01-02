package CodeForDSA.Recursion.Recursoin_HW;
import java.util.*;

public class Find_Lenght_Of_String {

    public static void find_Lenght_Of_String(String str, int stringLength, int i) {
        if( i == str.length() ) {
            System.out.print(stringLength);
            return;
        }

        stringLength ++;
        find_Lenght_Of_String(str, stringLength, i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String Value : ");
        String str = sc.nextLine(); 

        int stringLength = 0;

        System.out.print("Your provided String length is : " + str + " - (");
        find_Lenght_Of_String(str, stringLength, 0);
        System.out.println(")");



    }    
}
