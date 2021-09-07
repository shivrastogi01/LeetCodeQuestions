class MinimumDeletionLongestPalindromeSubSequence{
	public static void main(String [] args){
		
		String str1="ABCDBA";
		 StringBuilder sb=new StringBuilder(str1);  
		sb.reverse();  
		String str2= sb.toString();  
		System.out.println("Minimum deletion required is "+"= " +(str1.length()-LCS(str1,str2)));
		
	}
	public static int LCS(String str1,String str2){
		int m=str1.length();
		int n= str2.length();
		
		int [][]t=new int[m+1][n+1];
		for(int i=0;i<m+1;i++){
			for(int j=0;j<n+1;j++){
				if(i==0||j==0)
				t[i][j]=0;
			}
		}
		for(int i=1;i<m+1;i++){
			for(int j=1;j<n+1;j++){
				if(str1.charAt(i-1)==str2.charAt(j-1)){
					t[i][j]=1+t[i-1][j-1];
				}
				else
				t[i][j]=Math.max(t[i-1][j],t[j][i-1]);
			}
		}
		return t[m][n];
		
		
	}

}