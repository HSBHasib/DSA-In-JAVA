package CodeForDSA.Bit_Manipulation.HomeWork_Bit_Manipulatoin;
import java.util.Scanner;

public class Swap_Two_numbers {

    public static void swapNumbers() {
     
        int a = 6, b = 7;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(" A = " + a + ", " + "B = " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        swapNumbers();
    }
}
