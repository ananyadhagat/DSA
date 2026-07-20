class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>result= new ArrayList<>();
        
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            
            String s= strs[i];
            char[] arr= new char[s.length()];
           arr=s.toCharArray();
           Arrays.sort(arr);
           

    String key = new String(arr);

    if (!map.containsKey(key)) {
        map.put(key, new ArrayList<>());
    }

    map.get(key).add(s);
        }
       for (Map.Entry<String, List<String>> entry : map.entrySet()) {
    result.add(entry.getValue());
}
return result;
    }
}