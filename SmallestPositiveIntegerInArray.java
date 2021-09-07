import java.util.Arrays;
 
class SmallestPositiveIntegerInArray{

static int firstMissingPositive(int arr[], int n)
{
 
    for(int i = 0; i < n; i++)
    {
       
      // Loop to check boundary
      // condition and for swapping
      while (arr[i] >= 1 && arr[i] <= n
             && arr[i] != arr[arr[i] - 1]) {
         
        int temp=arr[arr[i]-1];
            arr[arr[i]-1]=arr[i];
            arr[i]=temp;
      }
    }
 
    // Finding which index has value less than n
    for(int i = 0; i < n; i++)
        if (arr[i] != i + 1)
            return (i + 1);
 
    // If array has values from 1 to n
    return (n + 1);
}
 
// Driver Code
public static void main(String[] args)
{
    int arr[] = {1,2,3 };
    int n = arr.length;
    int ans = firstMissingPositive(arr, n);
     
    System.out.println(ans);
}
}