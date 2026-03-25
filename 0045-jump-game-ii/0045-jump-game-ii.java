class Solution {
    public int jump(int[] nums) {
     
    int currEnd=0;
    int max=0;
    int jump=0;
    for(int i=0; i<nums.length-1; i++){
        max=Math.max(max,nums[i]+i);

        if(i==currEnd){
            jump++;
            currEnd=max;
        }
    }
    return jump;
    }
    }
