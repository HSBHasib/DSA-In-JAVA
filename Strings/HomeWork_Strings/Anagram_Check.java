package CodeForDSA.Strings.HomeWork_Strings;
import java.util.*;

public class Anagram_Check {

    public static void anagram_Check(String str1, String str2) {

        // Convert both strings to lowercase (ignore case sensitivity)
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // First check - if lengths are the same
        if( str1.length() != str2.length() ){
            System.out.println("Not Anagram");
            return;
        }

        char arrStr1[] = str1.toCharArray();
        Arrays.sort(arrStr1); 

        char arrStr2[] = str2.toCharArray();
        Arrays.sort(arrStr2); 

        String sorted_Str1 = new String(arrStr1);
        String sorted_Str2 = new String(arrStr2);

        boolean result = sorted_Str1.equals(sorted_Str2);

        if( result ){
            System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }

        // Sortest form.... ( to is it anagram or not. )
        // String finalResult = sortedStr1.equals(sortedStr2) ? "Strings are Anagram" : "Not Anagram";
        // System.out.println(finalResult);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter first string: ");
        // String str1 = sc.nextLine();

        // System.out.print("Enter second string: ");
        // String str2 = sc.nextLine();

        String str1 = "hasib";
        String str2 = "sabih";
        
        anagram_Check(str1, str2);


    }    
}
