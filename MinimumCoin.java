

class MinimumCoin{
	public static void main(String [] args){
		
		int arr[]={1,1,2,5};
		int n=arr.length-1;
		int sum=2;
		System.out.println("number of minimum coin is "+minCoin(arr,n,sum));
		
	}

	public static int minCoin(int arr[],int n, int sum){
		
		int [][] t=new int [n+1][sum+1];
		int j=0,i=0;
		for(i=0; j<sum+1;j++)
		t[i][j]=Integer.MAX_VALUE-1;
		
		for( j=0;i<n+1;i++)
		t[i][j]=0;
		
		for(i=1;j<sum+1;j++){
			if(j%arr[0]==0)
			t[i][j]=j/arr[0];
			
			else
			t[i][j]=Integer.MAX_VALUE-1;
			
		}
		
		for (i=2;i<n+1;i++){
			for(j=1;j<sum+1;j++){
				
				if(arr[i-1]<=j){
					t[i][j]=Math.min(t[i][j-arr[i-1]]+1,t[i-1][j]);
					
				}
				else
				t[i][j]=t[i-1][j];
			}
		}
		return t[n][sum-1];		
	}
}