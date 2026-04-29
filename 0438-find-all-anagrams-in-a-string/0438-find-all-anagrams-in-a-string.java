class Solution {
    public List<Integer> findAnagrams(String s, String p) {
      List<Integer>result= new ArrayList();
      int k=p.length();
        for(int right=0; right<=s.length()-k; right++){
        String n =s.substring(right,right+k);
        if(isAnagram(n,p)){
        result.add(right);
        }
        }
        return result;
    }
    private boolean isAnagram(String n,String p){
        int[] freq= new int[26];
        for(int i=0; i<p.length(); i++){
            char ch=p.charAt(i);
            freq[ch-'a']++;

        }
        for(int i=0; i<n.length(); i++){
            freq[n.charAt(i)-'a']--;
        }
        for(int i=0; i<freq.length; i++){
            if(freq[i]!=0){
                return false;
            }
        }
     return true;
    }
}