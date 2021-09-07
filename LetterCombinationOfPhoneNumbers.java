class LetterCombinationOfPhoneNumbers{
    public void findAll(String digits,int j,Map<Character,String>map,StringBuilder sb,List<String>list)
    {
        if(j==digits.length())
        {
            list.add(sb.toString());
            return;
        }
        String current=map.get(digits.charAt(j));
        for(int i=0;i<current.length();i++)
        {
            sb.append(current.charAt(i));
            findAll(digits,j+1,map,sb,list);
            sb.deleteCharAt(sb.length()-1);
        }
        
    }
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        if(digits.length()==0)
            return list;
        Map<Character,String>map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        findAll(digits,0,map,new StringBuilder(),list);
        return list;
    }
    
}