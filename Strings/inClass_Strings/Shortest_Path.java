package CodeForDSA.Strings.inClass_Strings;
import java.util.*;

public class Shortest_Path {

    public static float Shortest_Path(String path) {
        
        int x = 0, y =0;

        for(int i=0; i<path.length(); i++){
            char diff = path.charAt(i);

            // South
            if( diff == 'S' ){
                y--;

            // North 
            } else if ( diff == 'N' ){
                y++;

            // West 
            } else if ( diff == 'W' ) {
                x--;

            // East 
            } else {
                x++;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;
        return ( (float)Math.sqrt(X2 + Y2) ); 

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Path Value = ");
        String str = sc.nextLine();

        System.out.println("Your Provided Path is : (" + str + ")");

        System.out.println("Here is the Shortest Path is = " + Shortest_Path(str));


    }
    
}
