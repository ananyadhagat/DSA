class Solution {
    public boolean satisfiesConditions(int[][] grid) {
       int r= grid.length;
       int c=grid[0].length;
for(int i=0; i<c; i++){
       for(int j=0; j<r-1; j++){
    if(grid[j][i]!=grid[j+1][i]){
        return false;
    }
       }
}
for(int i=0; i<r; i++){
     for(int j=0; j<c-1; j++){
        if(grid[i][j]==grid[i][j+1]){
            return false;
        }
     }
}
 return true;
    }
}