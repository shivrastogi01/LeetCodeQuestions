class PrintLongestRepeatingSubSequence{
	public static void main(String [] args){
		
		String s="ABCDABC";
		String str2=s;
		String str1=s;
		
		System.out.println(LCS(str1,str2));
		
	}
	public static String LCS(String str1,String str2){
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
				if(str1.charAt(i-1)==str2.charAt(j-1)&& i!=j){
					t[i][j]=1+t[i-1][j-1];
				}
				else
				t[i][j]=Math.max(t[i-1][j],t[j][i-1]);
			}
		}
		int i=m,j=n;
		String s="";
		StringBuilder input1 = new StringBuilder();
		while(i>0 &&j>0){
			if(str1.charAt(i-1)==str2.charAt(j-1)&& i!=j){
				input1.append(str1.charAt(i-1));
				//s.pushback(str1.charAt(i-1));
				i--;
				j--;
			}
			else{
				if(t[i][j-1]>t[i-1][j])
				j--;
				
				else
				i--;
			}
		}
		s=input1.reverse().toString();
		return s;
		
	}

}