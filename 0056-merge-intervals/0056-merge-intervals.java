class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
       List<int[]>list= new ArrayList<>();
       int prev=intervals[0][1];
      int in=intervals[0][0];
      int out=intervals[0][1];
       for(int i=1; i<intervals.length; i++){
        

        //overlap
        if(intervals[i][0]<=out){
            in=Math.min(in,intervals[i][0]);
            out=Math.max(out,intervals[i][1]);
        }
        else{
            list.add(new int[]{in,out});
            in=intervals[i][0];
            out=intervals[i][1];
            prev= intervals[i-1][1];
        }
       } 
       list.add(new int[]{in,out});
       int[][] arr = list.toArray(new int[list.size()][]);
       return arr;
    }
}