class Solution {
    public int[] getConcatenation(int[] nums) {
        int j=0;
        int k=0;
        int[] ans= new int[nums.length*2];
     while(j<2){
      for(int i=0; i<nums.length; i++){
      ans[k]=nums[i];
      k++;
      }
      j++;
     }
    return ans; 
    }
}