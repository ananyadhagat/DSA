class Solution {
    public long countPairs(int[] nums, int k) {
   HashMap<Integer,Integer>map= new HashMap<>();
   long ans=0;
   for(int i=0; i<nums.length; i++){
    int g=gcd(nums[i],k);
    for (int prev : map.keySet()) {
        if ((long) g * prev % k == 0) {
            ans += map.get(prev);
        }
    }
    map.put(g,map.getOrDefault(g,0)+1);
   }
return ans;
    }
    private int gcd(int nums,int k){
        while(k!=0){
    int temp=k;
    k=nums%k;
    nums=temp;
        }
        return nums;
    }
}