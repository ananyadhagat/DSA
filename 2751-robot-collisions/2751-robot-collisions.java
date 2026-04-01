class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<Robot> robots = new ArrayList<>();

for(int i = 0; i < positions.length; i++) {
    robots.add(new Robot(positions[i], healths[i], directions.charAt(i), i));
}
        Collections.sort(robots, (a, b) -> a.pos - b.pos);
        Stack<Robot> stack= new Stack<>(); 
for(Robot curr: robots){
    if(curr.dir=='R'){
        stack.push(curr);
    }
    else{
        while(!stack.isEmpty() && stack.peek().dir=='R'){
            if(stack.peek().health==curr.health){
                stack.pop();
                curr=null;
                break;
            }
            else if(stack.peek().health>curr.health){
                stack.peek().health--;
                curr=null;
                break;
            }
            else{
                curr.health--;
                stack.pop();
            }
        }
        if(curr!=null){
            stack.push(curr);
        }
    }
}
       int n = positions.length;
        int[] result = new int[n];

        while(!stack.isEmpty()){
            Robot r = stack.pop();
            result[r.index] = r.health;
        }

        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(result[i] > 0){
                ans.add(result[i]);
            }
        }

        return ans;


    }
} 
class Robot {
    int pos;
    int health;
    char dir;
    int index;
    Robot(int p, int h, char d, int i) {
        pos = p;
        health = h;
        dir = d;
        index=i;
    }
}