package CodeForDSA.OOPS.inClassWork_OOPs.Static_Keyword;
import java.util.*;

public class Static_Keyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student Hasib = new Student();
        Hasib.collegeName = "NHMSC";
        System.out.println("Hasib College_Name : " + Hasib.collegeName);

        Student adib = new Student();
        System.out.println("Adib College_Name : " + adib.collegeName);
        
    }
}

class Student {
    String name;
    int roll;

    static String collegeName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }


    void setName(int roll){
        this.roll = roll;
    }

    int getRoll(){
        return this.roll;
    }

}
