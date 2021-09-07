import java.lang.*;
import java.util.*;
 
public class MinimumSumDifferenceInArray {
 
    // function to find min sum after operation
    static int absSumDidd(int a[])
    {
        // Sort the array
        Arrays.sort(a);
         
        // Pick middle value
        int midValue = a[a.length / 2];
 
        // Sum of absolute differences.
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + Math.abs(a[i] - midValue);
        }
        
        return sum;      
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = {1,2,7 };
        System.out.print(absSumDidd(arr));       
    }
   
}