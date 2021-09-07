class CombinationSumWithoutRepeatation {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> result=new ArrayList();
        Arrays.sort(candidates);
        backtrack(candidates,0,target,new ArrayList(), result);
        return result;
    }
        private void backtrack(int []cand,int start,int target,List<Integer> list,List<List<Integer>> result){
            if(target<0)
                return;
            if(target==0)
                result.add(new ArrayList(list));
            for(int i=start;i<cand.length; i++)
            {
                if(i==start||cand[i]!=cand[i-1]){
                   list.add(cand[i]);
                backtrack(cand,i+1,target-cand[i],list,result);
                list.remove(list.size()-1);   
                }
              
            }
            
        }
    }

