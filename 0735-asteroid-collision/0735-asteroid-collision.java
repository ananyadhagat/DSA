class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>stack= new Stack<>();
      
     for(int i=0; i< asteroids.length; i++){
        boolean destroyed= false;
        int b= asteroids[i];

     while(!stack.isEmpty()&& (stack.peek()>0&&b<0)){
     if(Math.abs(asteroids[i])>Math.abs(stack.peek())){
        stack.pop();
     }
     else if(stack.peek()==-b){
        stack.pop();
       destroyed = true;
       break;
     }
     else{
      destroyed = true;
      break;  
     } 
     }
      
      if(!destroyed){
    stack.push(b);
      }
     } 
  int ans[] =new int[stack.size()];
for (int i = 0; i < stack.size(); i++) {
    ans[i] = stack.get(i);
}
return ans;
    }
}