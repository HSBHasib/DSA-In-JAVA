package CodeForDSA.OOPS.inClassWork_OOPs.Inheritance;
import java.util.*;

public class Multi_Level_Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // [ This folder is the example of "Multi Level Inheritance" ]

        Dog tommy = new Dog();
        // tommy.eat();
        // tommy.name();
        tommy.Breed = "American";
        System.out.println(tommy.Breed);


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
class Mammal extends Animal {
    int lags;
}

// Derived class / child class 
class Dog extends Mammal {
    String Breed;

    void name() {
        System.out.println("I am Tommy");
    }
}
