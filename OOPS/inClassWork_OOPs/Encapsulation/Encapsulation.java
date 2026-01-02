package CodeForDSA.OOPS.inClassWork_OOPs.Encapsulation;
import java.security.PrivateKey;
import java.util.*;

public class Encapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Defination of Encapsulation -> 
        /* Encapsulation is defined as the 'Wrapping up' of data and methods under a single unit.
           It also implements data hiding. */

        Student s1 = new Student();
        s1.name = "Hasibur Rahman";
        s1.clas = "One";
        s1.roll = 4128;
        s1.age = 20;
        
        // Check the value in the Variables
        System.out.println(s1.name);
        System.out.println(s1.clas);
        System.out.println(s1.roll);
        System.out.println(s1.age);
        
        
        // Set_PassCode
        s1.setPassCode("Hasib HSB"); 

        // Get_PassCode
        System.out.println(s1.getPassCode()); 

    }
}

class Student{
    String name;
    String clas;
    int roll;
    int age;
    private String passCode;

    // Set_PassCode Function
    void setPassCode(String passCode){
        this.passCode = passCode;
    }

    // Get_PassCode Function
    String getPassCode(){
        return this.passCode;
    }
    
}