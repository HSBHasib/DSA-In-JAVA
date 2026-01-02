package CodeForDSA.Strings.inClass_Strings;
import java.util.*;

public class String_Is_Palindrome {

    public static boolean String_Is_Palindrome(String str) {

        for(int i=0; i<str.length()/2; i++){
            if( str.charAt(i) != str.charAt(str.length()-i-1) ){
                return false;
            }
        }
        return true ;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String Value = ");
        String str = sc.nextLine();

        String_Is_Palindrome(str);
      
        System.out.println("Your Provided String is : (" + str + ")");
        if( String_Is_Palindrome(str) ){
            System.out.println("String is palindrome.");
        } else {
            System.out.println("String is not palindrome.");
        }




    }    
}
