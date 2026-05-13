class Solution {
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        List<Character>list= new ArrayList();
        
        StringBuilder sb = new StringBuilder(s);
            list.add('a');
             list.add('e');
              list.add('i');
               list.add('o');
                list.add('u');
                 list.add('A');
                  list.add('I');
                   list.add('O');
                    list.add('U');
                     list.add('E');
            
        
        while(left<=right && right>=0&&left<s.length()){
            if(list.contains(s.charAt(left))&& !list.contains(s.charAt(right))){
                right--;

            }
            else if(!list.contains(s.charAt(left))&& list.contains(s.charAt(right))){
                left++;    
            }
            else if(list.contains(s.charAt(left))&& list.contains(s.charAt(right))){
                char temp = sb.charAt(left);
sb.setCharAt(left, sb.charAt(right));
sb.setCharAt(right, temp); 
           left++;
           right--;
            }
            else{
                left++;
                right--;
            }
        }
        return sb.toString();
    }
    
   
 
}