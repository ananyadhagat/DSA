class Solution {
    public int largestRectangleArea(int[] heights) {
    Stack<Integer>stack= new Stack<>();
int n= heights.length;
    int[] pse = new int[n];
        int[] nse = new int[n];

    for(int i=0; i<heights.length; i++){
    while(!stack.isEmpty() && heights[stack.peek()]>heights[i]){
        stack.pop();

    }
    pse[i]=stack.isEmpty() ? -1 : stack.peek();
    stack.push(i);
    }
stack.clear();
    for(int i= heights.length-1; i>=0; i--){
    while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
        stack.pop();
    }    
    nse[i]=stack.isEmpty() ? heights.length : stack.peek();
    stack.push(i);
    } 
    int area=0;
    for(int i=0; i<heights.length; i++){
    int width= nse[i]-pse[i]-1;
    int height=heights[i];
    area= Math.max(area, height*width);
    }
    return area;
    }
}