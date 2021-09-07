import java.util.Scanner;

class DeletingKDigit{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number ");
		String str= sc.nextLine();
		
		System.out.println("Enter how many digit you want to delete");
		int n=sc.nextInt();
		
		if(n>str.length())
		System.out.println(" invalid input ");
		
		if(str.length()==0)
		System.out.println(" Please enter valid string");
		
		//str = str.substring(0, str.length()-n);
		//System.out.println(str);
		for (int i=0;i<str.length() - n;i++)
		System.out.print(str.charAt(i));
	}
}