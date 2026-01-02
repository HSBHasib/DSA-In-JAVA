package CodeForDSA.OOPS.inClassWork_OOPs.Polymorphism;
import java.util.*;

public class Method_Overriding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Run Time Polymorphism / (Dynamic)
        // [ Parent and child classes both contain the same function with a different defination ]

        Animal ani1 = new Animal();
        ani1.eat();

        Dog dobby = new Dog();
        dobby.eat();

    }   
}

class Animal {
    void eat() {
        System.out.println("eats");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("eats biscuit");
    }
}
