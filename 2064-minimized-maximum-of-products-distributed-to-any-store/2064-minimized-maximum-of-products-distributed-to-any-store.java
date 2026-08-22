class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int high=0;
        for(int q:quantities){
            high=Math.max(q,high);
        }
      
        int low=1;
       
        int ans=high;
        while(low<=high){
            int storesneeded=0;
            int mid= low+(high-low)/2;

            for(int q:quantities){
                storesneeded+=((q+mid-1)/mid);
                if(storesneeded>n){
                    break;
                }
            }
            if(storesneeded<=n){
                //possible
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
       return ans;   
    }
}