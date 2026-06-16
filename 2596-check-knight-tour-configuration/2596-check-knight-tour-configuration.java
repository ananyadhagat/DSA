class Solution {
  static  int[] dx={1,-1,2,2,-2,-2,1,-1};
   static  int[] dy={-2,-2,-1,1,-1,1,2,2};
    public boolean checkValidGrid(int[][] grid) {
        return isValid(grid,0,0,grid.length,0);
    }
    private boolean isValid(int[][]grid,int rows,int cols,int n,int expVal){
       if(rows<0||cols<0||rows>=n||cols>=n||grid[rows][cols]!=expVal){
            return false;
        }
        if(expVal==n*n-1){
            return true;
        }
        
        for(int i=0; i<dx.length; i++){
       if(isValid(grid,rows+dx[i],cols+dy[i], n, expVal+1)){
        return true;
       }
        
        }
        return false;
       
    }
}