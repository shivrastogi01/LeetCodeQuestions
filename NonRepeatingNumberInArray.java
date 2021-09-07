import java.util.*;

class NonRepeatingNumberInArray{
  
    static int firstNonRepeating(int arr[], int n)
    {
        // Insert all array elements in hash
        // table
		int ans=0;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            }
            else {
                m.put(arr[i], 1);
            }
        }
  
        // Traverse through map only and
        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<Integer, Integer> x : m.entrySet())
            if (x.getValue() == 1)
              // System.out.print(x.getKey() + " ");
			  ans=x.getKey();
			  
			  return ans;
    }
  
    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 9, 4, 9, 6, 4 };
        int n = arr.length;
      System.out.println(  firstNonRepeating(arr, n));
    }
}