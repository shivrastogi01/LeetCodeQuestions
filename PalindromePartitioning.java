class PalindromePartitioning{
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
			for(int k= i ;k<=j-1;k++){
				int temp=partition(str,i,k)+partition(str,k+1,j)+1;
				
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