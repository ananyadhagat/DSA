class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int n= encodedText.length();
        StringBuilder sb= new StringBuilder();
        if(rows==1){
            return encodedText;
        }
    int cols= n/rows;
    int m=0;
    
    char matrix[][]= new char[rows][cols];
    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
           char ch=encodedText.charAt(m);
           if(ch!=' '){
             matrix[i][j]=ch;
           }
           else
           matrix[i][j]=' ';
          
           m++;
        }
    }
for(int startCol = 0; startCol < cols; startCol++){
            int i = 0;
            int j = startCol;

            while(i < rows && j < cols){
                sb.append(matrix[i][j]);  // pick char
                i++;   // move down
                j++;   // move right (diagonal)
            }
        }
        int end = sb.length() - 1;
        while(end >= 0 && sb.charAt(end) == ' '){
            end--;
        }

return sb.substring(0, end+1);

    }
}