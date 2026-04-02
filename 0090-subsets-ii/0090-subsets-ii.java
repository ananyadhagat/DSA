class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> set= new HashSet<>();
     backtrack(nums, 0, new ArrayList<>(),set );
     return new ArrayList<>(set);   
    }
    private void backtrack(int[] nums, int index, List<Integer>current, Set<List<Integer>> set){
      
        set.add(new ArrayList<>(current));
        
        for(int i=index; i<nums.length; i++){
            current.add(nums[i]);
            backtrack(nums, i+1, current, set);
            current.remove(current.size()-1);
        }
    }
}