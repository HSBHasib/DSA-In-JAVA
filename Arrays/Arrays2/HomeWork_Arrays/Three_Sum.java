package CodeForDSA.Arrays.Arrays2.HomeWork_Arrays;
import java.util.*;

public class Three_Sum {
    

    // 1st way to this Question
    public List<List<Integer>> three_Sum_FirstWay(int numbers[]) {

        int n = numbers.length;
        Arrays.sort(numbers); // Sort the Array
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();

        // Check all triplets using three nested loops.
        for(int i=0; i<n-2; i++){
            for(int j=1+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){

                    if( ( numbers[i] + numbers[j] + numbers[k] ) == 0 ){
                        s.add(Arrays.asList(numbers[i], numbers[j], numbers[k] ));
                    }
                }
            }
        }

        // Convert set to final answer list
        ans.addAll(s);
        return ans;

        
    }
    
    

    // 2nd way to this Question
    public List<List<Integer>> three_Sum_SecWay(int numbers[]) {

        int n = numbers.length;
        Arrays.sort(numbers); // Sort the Array
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();

        // Check all triplets using three nested loops.
        for(int i=0; i<n-2; i++){

            int start = i+1;
            int end = n-1;

            while( start < end ){

                int sum = ( numbers[i] + numbers[start] + numbers[end] );

                if( sum == 0 ){
                     s.add(Arrays.asList(numbers[i], numbers[start], numbers[end] ));
                     start++;
                     end--;

                } else if ( sum < 0 ){
                    start++;
                } else {
                    end--;
                }
            }
        }

        // Convert set to final answer list
        ans.addAll(s);
        return ans;

        
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbers[] = {-4, -1, -1, 0, 1, 2};

        // three_Sum(numbers);

    }

}
