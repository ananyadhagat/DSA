class Solution {
    public int heightChecker(int[] heights) {
    int[] newArr= heights.clone();
    Arrays.sort(heights);
   int count=0;
    for(int i=0; i<heights.length; i++){
        if(heights[i]!=newArr[i]){
            count++;
        }
    }
    return count;
    }
}