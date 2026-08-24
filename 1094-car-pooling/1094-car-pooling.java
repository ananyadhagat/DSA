class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
      Arrays.sort(trips,(a,b)->Integer.compare(a[1],b[1]));
      PriorityQueue<int[]>minHeap= new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
    
      int currentPassengers=0;
      for(int[]trip:trips){
        int num= trip[0];
        int from= trip[1];
        int to= trip[2];

        while(!minHeap.isEmpty() && minHeap.peek()[0]<=from){
            currentPassengers -= minHeap.poll()[1];

        }
        currentPassengers+=num;
        minHeap.offer(new int[]{to, num});

        if(currentPassengers>capacity){
            return false;
        }
      }
return true;
    }
}