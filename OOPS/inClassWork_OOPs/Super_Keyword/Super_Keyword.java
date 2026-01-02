package CodeForDSA.OOPS.inClassWork_OOPs.Super_Keyword;
import java.util.*;

public class Super_Keyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defination of Super Keyword
        // [ Super Keyword is used to refer "immediate parent" class object. ]

        // 1. to access parent's properties.
        // 2. to access parent's methods.
        // 1. to access parent's constructor.


        Bear bhalu = new Bear();
        System.out.println(bhalu.color);

    }
}

class Animal {
    String color;
    
    Animal(){
        System.out.println("Animal Constructor is called.....");
    }
}

class Bear extends Animal {
    Bear(){
        // super();
        super.color = "Brown";
        System.out.println("Bear Constructor is called.....");
    }
}
