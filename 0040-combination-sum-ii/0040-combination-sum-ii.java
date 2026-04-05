class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<Integer>current= new ArrayList<>();
    List<List<Integer>> result= new ArrayList<>();
    Arrays.sort(candidates);
    backtrack(0, candidates, target,0, current, result);
    return result;
    }
    private void backtrack(int index, int[] candidates, int target,int currentSum,List<Integer>current, List<List<Integer>> result ){
        if(currentSum==target){
        result.add(new ArrayList<>(current));
        return;
        }
        //skip
        if(currentSum>target){
            return;
        }
       for(int i=index; i<candidates.length; i++ ){
       if(i>index && candidates[i]==candidates[i-1]){
        continue;
       }
       current.add(candidates[i]);

       backtrack(i+1, candidates, target, currentSum+candidates[i], current,result);

       current.remove(current.size()-1);
       }

    }
}