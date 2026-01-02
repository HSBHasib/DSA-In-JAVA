package CodeForDSA.StringBuilder.inClass_StringBuilder;
import java.util.*;

public class Reverse_String {

    public static String Reverse_String(String str) {

        StringBuilder stringB = new StringBuilder(str);

        for(int i=0; i<str.length()/2; i++){

            int front = i;
            int back = stringB.length() - i - 1;

            char frontChar = stringB.charAt(front);
            char backChar = stringB.charAt(back);

           stringB.setCharAt(front, backChar);
           stringB.setCharAt(back, frontChar);

        }
        return stringB.toString();
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "Hello";

        String reverse_String = Reverse_String(str);
        System.out.println(reverse_String);


    }    
}
