class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int[] arr= new int[nums.length];
        int j=0;
        int count=1;
        arr[j++]=nums[0];
    for(int i=1; i<nums.length; i++){
        if(nums[i]==nums[i-1]){
            count++;
        }
        else{
            count=1;
        }
        if(count<=k){
            arr[j]=nums[i];
            j++;
        }

    }
    return Arrays.copyOf(arr, j);
    }
}