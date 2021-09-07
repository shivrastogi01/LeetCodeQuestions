import java.util.Scanner;


class CountNumberOfSubsetWithGivenDifference{
	
	public static void main(String [] args){
		
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the difference you want is subset");
		int diff=sc.nextInt();
		int result=findSubsetDiff(arr,n,diff);
		System.out.println("The number of subset with difference "+diff +" = "+result);
		
	}
	
	public static int findSubsetDiff(int arr[],int n, int diff){
		int SumArray=0;
		for(int i=0;i<n;i++)
		SumArray+=arr[i];
		
		//s1 -s2 =diff equation 1
		//s1+s2= sum arr equation 2 by solving both the equation we get
		int s1= (diff +SumArray)/2;
		int res=subsetSum(arr,n,s1);
		return res;
	}
	
	static int subsetSum(int a[], int n, int sum)
{
      
    // Initializing the matrix
    int tab[][] = new int[n + 1][sum + 1];
  
    // Initializing the first value of matrix
    tab[0][0] = 1;
  
    for(int i = 1; i <= sum; i++)
        tab[0][i] = 0;
  
    for(int i = 1; i <= n; i++)
        tab[i][0] = 1;
  
    for(int i = 1; i <= n; i++) 
    {
        for(int j = 1; j <= sum; j++) 
        {
              
            // If the value is greater than the sum
            if (a[i - 1] > j)
                tab[i][j] = tab[i - 1][j];
  
            else 
            {
                tab[i][j] = tab[i - 1][j] + 
                            tab[i - 1][j - a[i - 1]];
            }
        }
    }
  
    return tab[n][sum];
}
  
	
}