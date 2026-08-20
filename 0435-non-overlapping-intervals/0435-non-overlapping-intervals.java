class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
     int remove = 0;
        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            // Overlap
            if (intervals[i][0] < prevEnd) {
                remove++;
            } 
            // No overlap
            else {
                prevEnd = intervals[i][1];
            }
        }

        return remove; 
    }
}