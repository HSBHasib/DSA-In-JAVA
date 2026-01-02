package CodeForDSA.Recursion.Recursion2.inClassWork_Recursion2;
import java.util.*;

public class BinaryString {

    public static void print_BinaryString(int n, int lastPlace, String str) {
        if( n == 0 ){
            System.out.println(str);
            return;
        }

        print_BinaryString(n-1, 0, str+"0");
        if( lastPlace == 0 ){
            print_BinaryString(n-1, 1, str+"1");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        print_BinaryString(3, 0, "");

    }    
}
