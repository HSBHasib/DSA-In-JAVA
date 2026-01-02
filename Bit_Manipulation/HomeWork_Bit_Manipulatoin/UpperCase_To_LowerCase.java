package CodeForDSA.Bit_Manipulation.HomeWork_Bit_Manipulatoin;
import java.util.Scanner;

public class UpperCase_To_LowerCase {
    public static void upperCase_To_LowerCase() {

        for(char ch='A'; ch<='Z'; ch++){
            char ans = (char) (ch | 32);
            System.out.print(ans + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        upperCase_To_LowerCase();
    }
}
