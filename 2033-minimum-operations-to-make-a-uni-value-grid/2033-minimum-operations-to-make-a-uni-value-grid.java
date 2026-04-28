class Solution {
    public int minOperations(int[][] grid, int x) {
        
      //convert to 1 d array
      int r= grid.length;
    int c= grid[0].length;
    if(r==1&& c==1){
        return 0;
    }
    int[] arr= new int[r*c];
      for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
             arr[i*c+j]=grid[i][j];
             
        }
      }
      int rem = arr[0] % x;
        for (int val : arr) {
            if (val % x != rem) {
                return -1;
            }
        }
    Arrays.sort(arr);
   //find mid
   int m=arr.length/2;
   int mid=arr[m];
   int count=0;
   for(int i=0; i<arr.length; i++){
    int opr=Math.abs(arr[i]-mid) /x;
    count+=opr;
   }
   return count;
    }
}