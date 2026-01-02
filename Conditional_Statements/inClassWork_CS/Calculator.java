package CodeForDSA.Conditional_Statements.inClassWork_CS;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
// Question 1 => [ Create a Calculator +, -, *, /, %  using Switch Case ]

        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        System.out.print("Enter Operator : ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+' : System.out.println("Addition of (" + a + operator + b + ") is : " + (a+b)); 
                break;

            case '-' : System.out.println("Subtraction of (" + a + operator + b + ") is : " + (a-b)); 
                break;

            case '*' : System.out.println("Multiplication of (" + a + operator + b + ") is : " + (a*b)); 
                break;

            case '/' : System.out.println("Division of (" + a + operator + b + ") is : " + (a/b)); 
                break;

            case '%' : System.out.println("Modulus of (" + a + operator + b + ") is : " + (a%b)); 
                break;

            default: System.out.println("Pleae enter the right Operator");
        }
    }    

}
