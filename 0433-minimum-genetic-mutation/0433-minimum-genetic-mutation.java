class Solution {
	public static class Pair{
		String str;
		int val;
		
		Pair(String str, int val){
			this.str = str;
			this.val = val;
		}
	}
	
    public int minMutation(String start, String end, String[] bank) {
        HashSet<String> allowed = new HashSet<>();
        for(String str : bank)
        	allowed.add(str);
        Queue<Pair> que = new ArrayDeque<>();
        que.add(new Pair(start, 0));
        char[] chs = {'A','C','G','T'};
        
        while(que.size() > 0) {
        	Pair rem = que.remove();
        	if(rem.str.equals(end))
        		return rem.val;
        	StringBuilder sb = new StringBuilder();
        	sb.append(rem.str);
        	for(int i = 0; i < 8; i++) {
        		StringBuilder newsb = new StringBuilder();
                newsb.append(sb);
        		for(char ch : chs) {
	        		newsb.setCharAt(i, ch);
	        		if(allowed.contains(newsb + "")) {
	        			allowed.remove(newsb + "");
	        			que.add(new Pair(newsb + "", rem.val +1));
	        		}
        		}
        	}
        }
        return -1;
    }
}