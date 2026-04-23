class Solution {
    public List<String> letterCasePermutation(String s) {
         List<String> result = new ArrayList<>();
        backtrack(s, 0, new StringBuilder(), result);
        return result;
    }
    private void backtrack(String s, int index, StringBuilder current, List<String> result){
    if(current.length()==s.length()){
        result.add(current.toString());
        return;
    }
    char ch = s.charAt(index);
    if (Character.isDigit(ch)) {
            current.append(ch);
            backtrack(s, index + 1, current, result);
            current.deleteCharAt(current.length() - 1); // backtrack
        } else {
            // lowercase
            current.append(Character.toLowerCase(ch));
            backtrack(s, index + 1, current, result);
            current.deleteCharAt(current.length() - 1);

            // uppercase
            current.append(Character.toUpperCase(ch));
            backtrack(s, index + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}