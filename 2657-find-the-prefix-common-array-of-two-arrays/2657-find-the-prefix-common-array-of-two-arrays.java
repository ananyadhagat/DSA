class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] arr= new int[A.length];
        int count=0;
    HashMap<Integer,Integer>map= new HashMap<>();
        for(int i=0; i<A.length; i++){
            if(map.containsKey(A[i])){
                count++;
            }
            map.put(A[i], map.getOrDefault(A[i],0)+1);
            if(map.containsKey(B[i])){
                count++;
            }
            map.put(B[i], map.getOrDefault(B[i],0)+1);

            arr[i]=count;
        }
        return arr;
    }
}