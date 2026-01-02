package CodeForDSA.Strings.HomeWork_Strings;
import java.util.*;

public class Count_lowerCaseVowel {

    public static int count_lowerCaseVowel(String str) {
        int count = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if( (ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') ){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any String value : ");
        String str = sc.nextLine();

        int count_lowerCaseVowel = count_lowerCaseVowel(str);
        System.out.println("Your provided String - (" + str + ") vowel have : " + count_lowerCaseVowel);

    }
}
