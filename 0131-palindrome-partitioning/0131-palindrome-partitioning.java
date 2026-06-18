class Solution {
    public List<List<String>> partition(String s) {
      
      List<List<String>>result=new ArrayList<>(); 
      backtrack(new ArrayList<>(),result,s,0);
      return result;
    }
    private void backtrack(List<String>curr,List<List<String>>result,String s,int si){
        if(si==s.length()){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int ei=si; ei<s.length(); ei++){
        if(isPalin(s,si,ei)){
            curr.add(s.substring(si,ei+1));
            backtrack(curr, result, s, ei+1);
            curr.remove(curr.size()-1);
        }   
        }
    }
    private boolean isPalin(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}