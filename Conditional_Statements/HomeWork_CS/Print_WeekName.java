package CodeForDSA.Conditional_Statements.HomeWork_CS;
import java.util.*;

public class Print_WeekName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    // [ Write a Java program to input week number(1-7)and print day of week name using switch case.]

        System.out.print("Enter week number(1-7) : ");
        int week = sc.nextInt();

        switch (week) {
            case 1: System.out.println("Saturday");
                break;

            case 2: System.out.println("Sunday");
                break;

            case 3: System.out.println("Monday");
                break;

            case 4: System.out.println("Tuesday");
                break;

            case 5: System.out.println("Wednesday");
                break;

            case 6: System.out.println("Thursday");
                break;

            case 7: System.out.println("Friday");
                break;
        
            default: System.out.println("Invalid input : " + week + "\n" + "Please enter week number between 1-7. ");
        }
    }    
}
