class Solution {
    public int[] findErrorNums(int[] nums) {
        int[]arr= new int[2];
        Arrays.sort(nums);

        HashMap<Integer,Integer>map= new HashMap<>();
        for(int i=0; i<nums.length; i++){
             map.put(nums[i], map.getOrDefault(nums[i],0)+1);
             if(map.get(nums[i])==2){
                arr[0]=nums[i];
             }
         
        }
       
        for(int i=1; i<=nums.length; i++){
            if(!map.containsKey(i)){
                arr[1]=i;
                break;
            }
           else  map.remove(i);
       
        }

      return arr;
    }
}