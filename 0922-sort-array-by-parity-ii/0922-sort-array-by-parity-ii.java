class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        for(int i=0; i<nums.length; i++){
        if(i%2!=0&&nums[i]%2==0){
            if(i!=nums.length-1){
            int j=i;
            while(j<nums.length){
            if(nums[j]%2!=0&&j%2==0){
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
            break;
            }
            else{
                j++;
            }
            } } 
        }
        if(i%2==0&&nums[i]%2!=0){
             if(i!=nums.length-1){
            int j=i;
            while(j<nums.length){
            if(nums[j]%2==0&&j%2!=0){
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
            break;
            }
            else{
                j++;
            }
            } } 
        }
        }
return nums;
    }
}