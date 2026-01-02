package CodeForDSA.OOPS.inClassWork_OOPs.Polymorphism;
import java.util.*;

public class Method_Overloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Compile Time Polymorphism / (Static) 
        // [ Multiple functions with the same name but "different parameters" ]

        Calculator calc1 = new Calculator();
        
        System.out.println(calc1.sum(5,5));
        System.out.println(calc1.sum((float) 5.4, (float)4.4));

    }
}

class Calculator {
    int sum(int a, int b){
        return a + b ;
    }
    
    float sum(float a, float b){
        return a + b ;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
    
    float sum(float a, float b, float c){
        return a + b + c;
    }
}