class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

          int [] prefix= new int[nums.length];
          prefix[0]=nums[0];
          for(int i=1; i<nums.length; i++){
            prefix[i]= prefix[i-1]+ nums[i];
          }
     int result[]= new int[queries.length];
     //binary search
     for(int i=0; i<queries.length; i++){
        int left=0;
        int right= prefix.length-1;
        int ans=0;
        while(left<=right){
        int mid= left+( right-left)/2;

        if(prefix[mid]<=queries[i]){
        ans=mid+1;
        left=mid+1;
        }
        else{
            right=mid-1;
        }
        }
       result[i]=ans;
     }     
    
         return result;  
    }
}