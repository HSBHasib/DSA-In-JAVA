package CodeForDSA.OOPS.inClassWork_OOPs.Inheritance;
import java.util.*;

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Defination of Inheritance -> 
        /* Inheritance is when properties & methods "base" class are passed on to a "derived" class. */

        // Type of Inheritance
        // 1. Single Level Inheritance
        // 2. Multi Level Inheritance
        // 3. 


         // [ This folder is the example of "Single Level Inheritance" ]

        Fish shark = new Fish();
        shark.eat();

    }    
}

// Base class / Parent class
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    
    }
    void breathe() {
        System.out.println("Breathes");
    }
}

// Derived class / child class 
class Fish extends Animal {
    int fins;

    void Swim() {
        System.out.println("It can Swims in water");
    }
}
