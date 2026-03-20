class Solution {
    public int[][] generateMatrix(int n) {
 int[][] numbers= new int [n][n];
 int top=0;
 int bottom=n-1;
 int left=0;
 int right=n-1;
 int val=1;
 while(left<=right&&top<=bottom){

    for(int i=left; i<=right; i++){
    numbers[top][i]=val++;
    }
    top++;
    for(int i=top;i<=bottom; i++){
        numbers[i][right]=val++;
    }
    right--;
    for(int i=right; i>=left&&top<=bottom; i-- ){
        numbers[bottom][i]=val++;
    }
    bottom--;
    for(int i=bottom; i>=top&&left<=right;i--){
   numbers[i][left]=val++;
    }
    left++;
 }
 return numbers;
    }
}