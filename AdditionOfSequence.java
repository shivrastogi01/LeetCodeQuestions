class AdditionOfSequence{
	public static void main (String [] args){
		int number = 6;//6+5-4+3-2+1
		int sum=number;
		int count =0;
		
		for(int i=number-1; i>0;i --){
			count ++;
			if(count /2==0)
			sum -=i;
			else
			sum +=i;
			
		}
		System.out.println(sum);
	}


}