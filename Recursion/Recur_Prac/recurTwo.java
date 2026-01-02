package CodeForDSA.Recursion.Recur_Prac;
import java.util.*;

public class recurTwo {

    public static int tilling_Problem(int n) {
        if( n == 0 || n == 1 ) {
            return 1;
        }

        // Vertical choice
        int fnm1 = tilling_Problem(n-1);
        
        // Horizontal choice
        int fnm2 = tilling_Problem(n-2);

        int totalWays = fnm1 + fnm2;
        
        return totalWays;
    }


    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if( idx == str.length() ) {
            System.out.print(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if( map[ currChar - 'a' ] == true ) {
            removeDuplicates(str, idx+1, newStr, map);

        } else {
            map[ currChar - 'a' ] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }


    public static int friends_Pairing(int n) {
        if( n == 1 || n == 2 ){
            return n;
        }

        // Choice
        // Single
        int fnm1 = friends_Pairing(n-1);

        // Pairs
        int fnm2 = friends_Pairing(n-2);
        int pairWays = (n-1) * fnm2;

        int totWays = fnm1 + pairWays;
        return totWays;
    }


    public static void binaryString(int n, int lastPlace, String str) {
        if( n == 0 ) {
            System.out.println(str);
            return;
        }

        binaryString(n-1, 0, str+"0");
        if( lastPlace == 0 ) {
            binaryString(n-1, 1, str+"1");
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tilling Problem
        System.out.println("For n = '5' total tiles need = " + tilling_Problem(5));


        // Remove Duplicates in a String
        System.out.print("Remove Duplicates in an String - final value is = ");
        removeDuplicates("appnnacollege", 0, new StringBuilder(""), new boolean[26]);


        System.out.println();


        // Friends Pairing
        System.out.println("Total numbers of pairs for 4 is = " + friends_Pairing(4));


        // Binary String
        System.out.println("Binary String for 3 -");
        binaryString(3, 0, "");
        

    }
    
}
