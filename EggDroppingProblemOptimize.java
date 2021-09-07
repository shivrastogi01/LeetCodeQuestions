import java.util.Arrays;
class EggDroppingProblemOptimize{
	public static void main(String [] args){
		int floor=4;
		int egg=2;
		System.out.println(mimAttempt(egg,floor));
	}
	public static int mimAttempt(int egg, int floor){
		if(floor ==0 || floor ==1)
		return floor;
		
		if(egg==1)
		return floor;
		
		int mn=Integer.MAX_VALUE;
		int [][] t=new int[1001][1001];
			for (int[] row : t)
            Arrays.fill(row, -1);
			Arrays.deepToString(t);
			int left=0,right=0;
			for(int k=1;k<=floor-1;k++){
				if(t[egg -1][k-1]!=-1)
				left=t[1][k];
				else{
				left=mimAttempt(egg-1,k-1);
				t[1][k]=left;
				}
				if(t[k+1][floor]!=-1)
				right=t[egg][floor -k];
				else{
					right=mimAttempt(egg,floor-k);
					t[k+1][floor]=right;
				}
			int temp=1+ Math.max(left, right);
			mn=Math.min(mn,temp);
			
		}
		return mn;
	}
}