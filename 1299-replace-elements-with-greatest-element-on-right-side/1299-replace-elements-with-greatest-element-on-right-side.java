class Solution {
    public int[] replaceElements(int[] arr) {
        int max= Integer.MIN_VALUE;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                max=Math.max(arr[j], max);

            }
            arr[i]=max;
            max=Integer.MIN_VALUE;
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}