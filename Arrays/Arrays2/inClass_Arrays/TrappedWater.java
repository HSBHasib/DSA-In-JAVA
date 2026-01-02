package CodeForDSA.Arrays.Arrays2.inClass_Arrays;
import java.util.*;

public class TrappedWater {

    public static int trappedRainWater(int height[]) {
        int n = height.length;

        // Calculate left Max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // Calculate right Max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        // loop
        int trappedWater = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel-height[i];
        }
        return trappedWater;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input form the User
        System.out.print("Enter the size of all boundaries : ");
        int n = sc.nextInt();

        int height[] = new int[n];

        for(int i=0; i<height.length; i++){
            System.out.print((i+1) + " boundaries height = ");
            height[i] = sc.nextInt();
        }

        System.out.println("Trapped RainWater = " + trappedRainWater(height));


        // int height[] = {4, 2, 0, 6, 3, 2, 5};
        // System.out.println("Trapped RainWater = " + trappedRainWater(height));

        
    }
}
