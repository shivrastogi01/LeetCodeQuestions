import java.util.Scanner;
import java.util.*;

class NearestPerfectSquare{
	public static void main(String[] args){
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		double d=Math.sqrt(a);
		a=(int)d;
		float e=(float)(d-a);
		//System.out.println(d);
		//System.out.println(e);
			if(e>=.5)
			{
				a=a+1;
			System.out.println("Nearest perfect square " + a*a);
			}
			else
			System.out.println("Nearest perfect square "+a*a);
	}

}