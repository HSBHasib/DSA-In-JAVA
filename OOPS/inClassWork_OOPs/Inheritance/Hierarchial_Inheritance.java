package CodeForDSA.OOPS.inClassWork_OOPs.Inheritance;
import java.util.*;

public class Hierarchial_Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mammal m1 = new Mammal();
        m1.eat();
        m1.walk();

        Fish f1 = new Fish();
        f1.eat();
        f1.swim();

        Bird b1 = new Bird();
        b1.eat();
        b1.fly();

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

    void walk() {
        System.out.println("Walks");
    }
}

// Derived class / child class 
class Fish extends Animal {

    void swim() {
        System.out.println("Swim");
    }
}

// Derived class / child class 
class Bird extends Animal {

    void  fly() {
        System.out.println("Fly");
    }
}