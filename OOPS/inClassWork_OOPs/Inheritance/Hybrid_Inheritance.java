package CodeForDSA.OOPS.inClassWork_OOPs.Inheritance;
import java.util.*;

public class Hybrid_Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Fish f1 = new Fish();
        f1.eat();
        f1.swim();

        Tuna t1 = new Tuna();
        t1.eat();
        t1.swim();
        t1.Cute();

        Shark s1 = new Shark();
        s1.eat();
        s1.swim();
        s1.big();

        
        Mammal m1 = new Mammal();
        m1.eat();
        m1.lags = 4;

        Dog d1 = new Dog();
        d1.eat();
        d1.honest();

        Cat c1 = new Cat();
        c1.eat();
        c1.milk();

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

    void swim() {
        System.out.println("Swim");
    }
}

// Derived class / child class 
class Tuna extends Fish {

    void Cute() {
        System.out.println("I am Tuna");
    }
}

// Derived class / child class 
class Shark extends Fish {

    void big() {
        System.out.println("I am Big Shark ");
    }
}


// Derived class / child class 
class Mammal extends Animal {
    int lags;
}

// Derived class / child class 
class Dog extends Mammal {
    
    void honest(){
        System.out.println("I am a dog, I am honest for my human");
    }
}

// Derived class / child class 
class Cat extends Mammal {
    
    void milk(){
        System.out.println("I am a cat, I love to drink Milk");
    }
}

