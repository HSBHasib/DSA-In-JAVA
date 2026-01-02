package CodeForDSA.OOPS.inClassWork_OOPs.Abstraction;
import java.util.*;

public class Abstract_Classes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Abstract Class
        // 1. Cannot create an instance of abstract class.
        // 2. Can have abstract/non-abstract methods.
        // 3. Can have constructors.

        Cat tom = new Cat();
        tom.eat();
        tom.walk();
        System.out.println(tom.color);
        
        System.out.println();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        // System.out.println(c.color);
    }    
}


abstract class Animal {
    // Constructors
    String color;
    Animal() {
        color = "Brown";
    }


    // Abstract method
    void eat(){
        System.out.println("eats");
    }

    // Non-abstract method / Concrete method
    abstract void walk();

}

class Cat extends Animal {
    void changeColor(){
        color = "White and black";
    }

    void walk(){
        System.out.println("Walk on 4 lags");
    }
}

class Chicken extends Animal{
     void changeColor(){
        color = "Redish";
    }

    void walk(){
        System.out.println("Walks on 2 lags");
    }
}
