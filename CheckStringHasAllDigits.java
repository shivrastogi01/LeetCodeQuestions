
class CheckStringHasAllDigits{
	public static void main(String [] args){
		String str="shiv";
		int count=0;
		
		for(int i=0;i<str.length();i++){
			if(!(str.charAt(i)>='0' && str.charAt(i)<='9'))
			count ++;
			
		}
		if(count==0)
		System.out.println("All are  Digits");
		else
		System.out.println("All are not Digits");
	}

}