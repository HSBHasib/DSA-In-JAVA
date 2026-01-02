package CodeForDSA.Strings.inClass_Strings;
import java.util.*;

public class SubString {


// We made this subString method
    public static void print_SubString(String str, int startIndex, int endIndex) {
        String subString = "";
        for(int i=startIndex; i<endIndex; i++){
            subString += str.charAt(i);
        }

        System.out.println("(Create manually) - SubString is : (" + subString + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // SubString
        String str = "Hello, I am Hasib";
        print_SubString(str, 12, str.length());

        
        // Java have already subString method
        String subString = str.substring(12, str.length());
        System.out.println("(Create by java method) - SubString is : (" + subString + ")");

    }    
}
