package CodeForDSA.OOPS.inClassWork_OOPs.Constructors;
import java.util.*;

public class Create_Construstors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for First Constructor
        Student s1 = new Student();
        
        // for Second Constructor
        Student s2 = new Student("Hasib");
        System.out.println(s2.name);
        
        // for Second Constructor
        Student s3 = new Student(19);
        System.out.println(s3.roll);

    }    
}

class Student {
    String name;
    int roll;

    // this is called ( non-parameterized Construstor )
    Student(){
        System.out.println("Constructors is called....");
    }

    // this is called ( Parameterized Construstor )
    Student(String name){
        this.name = name;
    }
    
    // this is called ( Parameterized Construstor )
    Student(int roll){
        this.roll = roll;
    }

}

