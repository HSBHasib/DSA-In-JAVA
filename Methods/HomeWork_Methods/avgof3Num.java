package CodeForDSA.Methods.HomeWork_Methods;
import java.util.*;

public class avgof3Num {

    // HomeWork Question 1 => [Write a Java method to compute the average of three numbers.]

        public static void avgOf3Num(int firstNum, int secNum, int thirdNum) {
            int avg = (firstNum + secNum + thirdNum)/3;
            System.out.println(avg);
        }


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // // HomeWork Question 1 => [ Write a Java method to compute the average of three numbers.]

        System.out.print("Enter first number : ");
        int firstNum = sc.nextInt();

        System.out.print("Enter second number : ");
        int secNum = sc.nextInt();

        System.out.print("Enter third number : ");
        int thirdNum = sc.nextInt();

        avgOf3Num(firstNum, secNum, thirdNum);
    }
}
