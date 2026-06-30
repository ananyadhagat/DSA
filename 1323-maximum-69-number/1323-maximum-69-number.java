class Solution {
    public int maximum69Number (int num) {
        String s= Integer.toString(num);
      for(int i=0; i<s.length(); i++){
      if( s.charAt(i)=='6'){
       StringBuilder sb = new StringBuilder(s);
sb.setCharAt(i, '9');
s = sb.toString();
        return Integer.parseInt(s);
      }
      }



    return num;

    }
}