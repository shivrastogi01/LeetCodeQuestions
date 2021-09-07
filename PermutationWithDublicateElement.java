class PermutationWithDublicateElement{
	int printPermutation(int [] a, int pos){
		if(pos==a.length -1)
		return a;
		
		HashSet<Integer> hash =new HashSet<Integer>();
		
		for(int i=pos;i<a.length;i++){
			if(hash.contains(a[i]==true))
			continue;
			
			hash.add(a[i]);
			swap(a,i,pos);
			printPermutation(a, pos+1);
			swap(a,i,pos);
		}
	}
}