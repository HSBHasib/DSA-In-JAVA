package CodeForDSA.OOPS.inClassWork_OOPs.Abstraction;
import java.util.*;

public class Interfaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // [ For java we have "Interface" but other language have "Multiple Inheritance" ]

        // Interface is a "blueprint" of a class
        // 1. All methods are public, abstract & without implementation.
        // 2. Used to achieve total abstraction. 
        // 3. Variable in the interface are final, public and static 

        Queen q = new Queen();
        q.moves(); 

        Rook r = new Rook();
        r.moves();

        King k = new King();
        k.moves();


        // Example of Multiple Inheritance in Java using Interfaces (Bear implements both Herbivore and Carnivore)
        Bear b = new Bear();
        b.meat();
        b.vegetable();
    }    
}


interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("Queen method is called.......");
        System.out.println("Up, down, left, right, diagonal (in all 4 dirns) ");
    }
}

class Rook implements ChessPlayer {
    public void moves(){
        System.out.println("Rook method is called.......");
        System.out.println("Up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves(){
        System.out.println("King method is called.......");
        System.out.println("Up, down, left, right, diagonal (by 1 step)");
    }
}



// Example of Multiple Inheritance in Java using Interfaces (Bear implements both Herbivore and Carnivore)

interface Herbivore {
    void vegetable();
}

interface Cornivore {
    void meat();
}

class Bear implements Herbivore, Cornivore {

    public void meat(){
        System.out.println("I eat meat");
    }

    public void vegetable(){
        System.out.println("I eat vegetables");
    }
}



