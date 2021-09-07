class LargestCommonSubString{
	public static void main(String [] args){
		
		String str1="ABCD";
		String str2="ABE";
		System.out.println(LCS(str1,str2));
		
	}
	public static int LCS(String str1,String str2){
		int m=str1.length();
		int n= str2.length();
		int result=0;
		
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
					result = Integer.max(result,
                                         t[i][j]);
				}
				else
				t[i][j]=0;
			}
		}
		return result;
		
		
	}

}