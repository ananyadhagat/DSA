class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result= new ArrayList<>();
        if(numRows==0) return result;
        List<Integer> row1= new ArrayList<>();
            row1.add(1);
            result.add(row1);   
        if(numRows ==1) return result;

         List<Integer> row2= new ArrayList<>();
            row2.add(1);
            row2.add(1);
            result.add(row2);
    
    for(int j=3; j<=numRows; j++){
           List<Integer> prev =result.get(result.size()-1);
           List<Integer> currRow= new ArrayList<>();
                currRow.add(1); //first 1
            for(int i=0; i<prev.size()-1; i++){
              int sum= prev.get(i)+prev.get(i+1);
              currRow.add(sum);
            }
            
            currRow.add(1);
            result.add(currRow);
        }
return result;
    }
}