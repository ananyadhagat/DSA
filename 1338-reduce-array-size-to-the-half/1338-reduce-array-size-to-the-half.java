
class Solution {
    public int minSetSize(int[] arr) {
       
        Map<Integer, Integer> count = new HashMap<>();
        
        // Step 1: Count frequencies
        for (int num : arr) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Get all frequencies and sort descending
        List<Integer> frequencies = new ArrayList<>(count.values());
        Collections.sort(frequencies, Collections.reverseOrder());
        
        // Step 3: Greedy removal
        int removed = 0;
        int target = arr.length / 2;
        int uniqueRemoved = 0;
        
        for (int freq : frequencies) {
            removed += freq;
            uniqueRemoved++;
            if (removed >= target) {
                return uniqueRemoved;
            }
        }
    
        return uniqueRemoved;
    }
}   
   