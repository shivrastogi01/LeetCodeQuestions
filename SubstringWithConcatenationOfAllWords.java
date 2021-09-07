class SubstringWithConcatenationOfAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
       HashMap<String,Integer> hm=new HashMap<>();
        for(String str:words){
            hm.put(str,hm.getOrDefault(str,0)+1);
        }
       
        int len=words[0].length();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<=s.length()-len*words.length;i++){
            HashMap<String,Integer> copy=new HashMap<>(hm);
            for(int j=0;j<words.length;j++){
                String str=s.substring(i+j*len,i+j*len+len);
                if(copy.containsKey(str)){
                    if(copy.get(str)==1){
                        copy.remove(str);
                    }else{
                        copy.put(str,copy.get(str)-1);
                    }
                    if(copy.size()==0){
                        ans.add(i);
                        break;
                    }
                }else{
                    break;
                }
            }
        }
        return ans;
    }
}