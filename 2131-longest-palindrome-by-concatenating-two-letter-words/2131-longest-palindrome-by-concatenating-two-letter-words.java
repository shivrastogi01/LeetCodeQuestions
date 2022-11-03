class Solution {
public int longestPalindrome(String[] words) {

    HashMap<String,Integer> map=new HashMap<>();
    int ans=0;
    int count=0;
    for(int i=0;i<words.length;i++){
        String s=words[i].charAt(1) +""+ words[i].charAt(0);
        if(s.equals(words[i])==true){
            if(map.containsKey(s)==true){
                count--;
                ans+=4;
                map.remove(s);
            }
            else{
                count++;
                map.put(s,1);
            }
            
        }
        else{
            
            int v=map.getOrDefault(s,0);
            if(v==0){
                int k=map.getOrDefault(words[i],0);
                k++;
                map.put(words[i],k);
            }
            else{
                v--;
                ans+=4;
                // System.out.println(i);
                if(v==0){
                    map.remove(s);
                }
                else{
                    map.put(s,v);
                }
            }
        }
    }
    // System.out.println(count);
    return count>0 ? ans+2 : ans;
}
}