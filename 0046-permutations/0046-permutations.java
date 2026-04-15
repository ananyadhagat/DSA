class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>result= new ArrayList<>();
        List<Integer>current= new ArrayList<>();
        boolean used[]=new boolean[nums.length];
        backtrack(current,result,nums,used);
        return result;
    }
    private void backtrack(List<Integer>current,List<List<Integer>>result,int nums[],boolean[] used ){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(used[i]) continue;
            current.add(nums[i]);
            used[i]=true;
            backtrack(current,result,nums,used);
            //undo
            current.remove(current.size()-1);
            used[i]=false;
        }
    }
}