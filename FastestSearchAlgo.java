import java.util.Scanner;
class FastestSearchAlgo {
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		
		System.out.println("Enter the number you want to find");
		int m =sc.nextInt();
		System.out.println(searchInsert(arr ,m, n));
		
		
		
	}
		
    public static int searchInsert(int[] nums, int target,int n) {
        if(target>nums[n-1])return n;
        if(n==0)return 0;
        for(int i=0;i<n;i++){
            if(nums[i]==target || nums[i]>target)return i;
        }
        return 0;
    }
}