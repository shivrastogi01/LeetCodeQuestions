import java.util.Scanner;

class LargestCommonPrefix {
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many words you want to compare");
		int n=sc.nextInt();
		String [] str=new String[n];
		System.out.println("Enter the words");
		
		for(int i=0;i<n;i++){
			str[i]=sc.nextLine();
			
		}
		System.out.println(longestCommonPrefix(str));
		
	}
    public static String longestCommonPrefix(String[] strs) {
        
        // Take first word as current prefix, shave off the last character whenever it doesn't match.

        String prefix = strs[0];
        int i = 1;

        while (i < strs.length && prefix.length() != 0) {
            if (strs[i].startsWith(prefix))
                i++;
            else
                prefix = prefix.substring(0, prefix.length() - 1); 
        }
        
        return prefix;
    }
}