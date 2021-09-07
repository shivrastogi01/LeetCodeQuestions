class EggDroppingProblem{
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
		for(int k=1;k<=floor;k++){
			int temp=1+ Math.max(mimAttempt(egg-1, k), mimAttempt(egg,floor-k));
			mn=Math.min(mn,temp);
			
		}
		return mn;
	}
}