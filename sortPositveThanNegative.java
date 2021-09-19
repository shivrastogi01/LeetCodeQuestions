class sortPositveThanNegative{
	public static void main(String [] args){
int [] m={1,3,-2,-1,5};
int k=0;
int [] n=new int[m.length];
for(int i=0; i<m.length;i++){
	if(m[i]<0){
	n[k]=m[i];
	k++;}
	else
	System.out.print(m[i]);
}

for(int i=0;i<k;i++){
	
	System.out.print(n[i]);
}

	}


}