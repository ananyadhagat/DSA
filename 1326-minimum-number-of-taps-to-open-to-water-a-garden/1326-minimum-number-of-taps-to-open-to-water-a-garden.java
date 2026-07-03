class Solution {
    public int minTaps(int n, int[] ranges) {
        int maxreach[] = new int[n+1];
        for(int i =0; i<=n; i++){
        int left=Math.max(0, i-ranges[i]);
        int right= Math.min(n, i+ranges[i]);
        maxreach[left]= Math.max(maxreach[left],right);
          
        }
        int taps=0;
        int curr=0;
        int farthest=0;
        for(int i=0; i<n; i++){
            farthest=    Math.max(farthest, maxreach[i]);
            if(farthest<=i){
                return -1;
            }
            if(i==curr){
                taps++;
                curr=farthest;
            }
        }
        return taps;
    }
    
}
