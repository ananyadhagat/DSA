class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        for(int i=0; i<l; i++){
            if(i!=nums[i]){
                return i;
            }
        }
      return l;
    }
}