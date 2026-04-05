class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> result= new ArrayList<>();  
      List<Integer> current= new ArrayList<>();
      backtrack(0,candidates,target,0,current,result);
      return result;
    }
    private void backtrack(int index, int[] candidates, int target, int currentSum, List<Integer>current, List<List<Integer>>result ){
    if(currentSum==target){
        //add current list to result 
        result.add(new ArrayList<>(current));
        return;
    }
    if(currentSum>target||index==candidates.length){
    return ;
    }
    //pick
    current.add(candidates[index]);
    backtrack(index,candidates, target, currentSum+candidates[index], current, result);
    current.remove(current.size()-1);
    //skip
    backtrack(index+1, candidates, target, currentSum, current, result);
    }
}