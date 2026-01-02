package CodeForDSA.StringBuilder.inClass_StringBuilder;
import java.util.*;

public class LetterToUpperCase {

    public static String toUpperCase(String str) {
        
        StringBuilder stringB = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        stringB.append(ch);

        for(int i=1; i<str.length(); i++){
            if( ( str.charAt(i) == ' ' ) && ( i < str.length()-1 ) ){
                stringB.append(str.charAt(i));
                i++; 
                stringB.append(Character.toUpperCase(str.charAt(i)));

            } else {
            stringB.append(str.charAt(i));
            }
        } 

        return stringB.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "hi, i am hasib";

        String UpperCase_letter = toUpperCase(str);
        System.out.println(UpperCase_letter);

    }    
}
