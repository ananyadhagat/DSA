class Solution {
    public boolean isValidSudoku(char[][] board) {
    HashMap<Integer,Integer>map =new HashMap<>();
    for(int i=0; i<board.length; i++){
        map.clear();
        for(int j=0; j<board[i].length; j++){

            char ch=board[i][j];
             if(ch=='.') continue;
            map.put(ch-'0',map.getOrDefault(ch-'0',0)+1);
            if(map.get(ch-'0')>1){return false;}
        }
    }
    map.clear();
     for(int j=0; j<board.length; j++){
       map.clear();
        for(int i=0; i<board[0].length; i++){
            char ch=board[i][j];
              if(ch=='.') continue;
            map.put(ch-'0',map.getOrDefault(ch-'0',0)+1);
            if(map.get(ch-'0')>1){return false;}
        }
    }
    
    map.clear();
    for(int n = 0; n < 9; n += 3) {
    for(int m = 0; m < 9; m += 3) {

        HashMap<Character,Integer> map1 = new HashMap<>();

        for(int i = n; i < n + 3; i++) {
            for(int j = m; j < m + 3; j++) {

                char ch = board[i][j];

                if(ch == '.') continue;

                map1.put(ch, map1.getOrDefault(ch, 0) + 1);

                if(map1.get(ch) > 1) return false;
            }
        }
    }
}
return true;
    }
}