class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int i=0;
        int n=gas.length;
        int total=0;
        int fcost=0;
    for(int k=0; k<n; k++){
        int diff=gas[k]-cost[k];
        fcost+=diff;
        total+=diff;

        if(fcost<0){
            i=k+1;
            fcost=0;
        }
    }
    return total >= 0 ? i:-1;  
    }
}