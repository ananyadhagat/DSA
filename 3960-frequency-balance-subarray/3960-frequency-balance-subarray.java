class Solution {
    public int getLength(int[] nums) {
   int n = nums.length;
        int ans = 1;
    for(int i=0; i<n; i++){
     HashMap<Integer,Integer>freq= new HashMap<>();
     HashMap<Integer,Integer>freqcount= new HashMap<>();
     
     for(int j=i; j<n; j++){
        int val= nums[j];
        int oldFreq= freq.getOrDefault(val,0);
        int newFreq= oldFreq+1;
        freq.put(val, newFreq);

        if(oldFreq>0){
            int cnt=freqcount.get(oldFreq)-1;
            if(cnt==0)
            freqcount.remove(oldFreq);
            else
            freqcount.put(oldFreq,cnt);
        }
        freqcount.put(newFreq, freqcount.getOrDefault(newFreq,0)+1);
        if(check(freq,freqcount)){
            ans=Math.max(ans, j-i+1);
        }
     }
    }
  return ans;
    }
   private boolean check(HashMap<Integer, Integer>freq,HashMap<Integer,Integer>freqcount){
    if(freq.size()==1)
    return true;

    if(freqcount.size()!=2)
    return false;

    Iterator<Integer>it= freqcount.keySet().iterator();

    int a= it.next();
    int b= it.next();
    int mn= Math.min(a,b);
    int mx= Math.max(a,b);

    return mx==2*mn;
   } 
}