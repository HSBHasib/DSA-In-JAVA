package CodeForDSA.StringBuilder.HomeWork_StringBuilder;
import java.util.*;

public class String_Compression {

    public static String string_compression(String str) {

        StringBuilder newStr = new StringBuilder("");

        for(int i=0; i<str.length(); i++){
            Integer count = 1;

            while( ( i < str.length()-1 ) && ( str.charAt(i) == str.charAt(i+1) ) ){
                count++;
                i++;
            }

            newStr.append(str.charAt(i));
            if( count > 1 ){
                newStr.append(count.toString());
            }
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from the User
        System.out.print("Enter any String value : ");
        String str = sc.nextLine();


        // String str = "aaabbbcccd";
        System.out.println(string_compression(str));


    }    
}
