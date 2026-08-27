class Solution {
    public List<Integer> getRow(int rowIndex) {
ArrayList<Integer>list= new ArrayList();
int[][]dp= new int[rowIndex+1][rowIndex+1];
        for(int i=0; i<=rowIndex; i++){
            dp[i][0]=1;
        }
        for(int j=0; j<=rowIndex; j++){
            dp[0][j]=1;
        }
     for(int i=1; i<=rowIndex; i++){
        for(int j=1; j<=rowIndex; j++){
            dp[i][j]=dp[i][j-1]+dp[i-1][j];
        }
     } 
    int j=0;
     for(int i=rowIndex; i>=0; i--){
       
            list.add(dp[i][j]);
           j++;
        
     }
     return list;  
    }
}