package CodeForDSA.StringBuilder.inClass_StringBuilder;
import java.util.*;

public class BasicsOf_StringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // using append method 1ta kore  char last a add korbo.
        StringBuilder stringB = new StringBuilder("");
        
        for(char ch='a'; ch<='z'; ch++){
            stringB.append(ch + " ");
        }
        System.out.print(stringB);

    }
}
