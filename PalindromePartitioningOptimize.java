import java.util.Arrays;

class PalindromePartitioningOptimize{
	public static void main(String[] args){
		String str="nitik";
		System.out.println("minimum partition required id = "+partition(str,0,str.length()-1));

}
	public static int	partition(String str,int i,int j){
			if(i>=j){
				return 0;
			}
			if(isPalindrome(str,i,j)==true)
			return 0;
			
			int mn=Integer.MAX_VALUE;
			int [][] t=new int[1001][1001];
			for (int[] row : t)
            Arrays.fill(row, -1);
			Arrays.deepToString(t);
			int left=0,right=0;
			for(int k= i ;k<=j-1;k++){
				if(t[i][k]!=-1)
				left=t[i][k];
				else{
				left=partition(str,i,k);
				t[i][k]=left;
				}
				if(t[k+1][j]!=-1)
				right=t[k+1][j];
				else{
					right=partition(str,k+1,j);
					t[k+1][j]=right;
				}
				int temp= 1+left+right;
				if(temp<mn)
				mn=temp;
			}
			return mn;
		}
		public static boolean isPalindrome( String str,int i, int j){
			while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
			
		}
}