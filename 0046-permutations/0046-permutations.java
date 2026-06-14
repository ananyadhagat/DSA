class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n= nums.length;
        List<Integer>current= new ArrayList<>();
        List<List<Integer>>result= new ArrayList<>();
        boolean[] used= new boolean[n];
        backtrack(current,result,used,nums);
        return result;
    }
    private void backtrack(List<Integer>current,List<List<Integer>>result,boolean[] used,int[] nums){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(used[i]) continue;
            current.add(nums[i]);
            used[i]=true;
            
            
                backtrack(current,result,used,nums);
        //undo
            current.remove(current.size()-1);
            used[i]=false;
        }

        
        
    }
}
