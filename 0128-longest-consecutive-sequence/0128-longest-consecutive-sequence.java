class Solution {
    public int longestConsecutive(int[] nums) {
    Arrays.sort(nums);
    int length=1;
    int n = nums.length;
    int prevLength=1;
    if(n!=0){
    for(int i=0; i<n-1; i++){
         if (nums[i + 1] == nums[i]) continue;
        if(nums[i+1]-nums[i] ==1){
            length++; 
        }
       else{
        prevLength=Math.max(prevLength,length);  
        length=1;
       }
        
    }
    prevLength = Math.max(prevLength, length);
    return prevLength;
    }
    return 0; 
    }
}