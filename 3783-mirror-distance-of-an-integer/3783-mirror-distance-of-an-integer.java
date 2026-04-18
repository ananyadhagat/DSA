class Solution {
    public int mirrorDistance(int n) {
       int ans= Math.abs(n-reverseInteger(n));
       return ans;
    }
    private int reverseInteger(int n){
        String a= Integer.toString(n);
        char[] s= a.toCharArray();
        int i=0;
        int j=s.length-1;
        while(i<j){
            char temp= s[j];
            s[j]=s[i];
            s[i]=temp;
            i++;
            j--;
        } 
        return Integer.parseInt(new String(s));
    }
}