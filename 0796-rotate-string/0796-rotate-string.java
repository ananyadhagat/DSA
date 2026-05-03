class Solution {
    public boolean rotateString(String s, String goal) {
       int sls =s.length();
       int slg =goal.length();
       if (sls != slg) {
            return false;
        }
       StringBuilder sb= new StringBuilder(s);
       StringBuilder sbg= new StringBuilder(goal);
       for(int i=0; i<sls; i++){
        {
            boolean Found = true;  // Assume a match unless proven otherwise

            // Compare each character of the rotated sb with goal
            for (int j = 0; j < slg; j++) {
                if (sb.charAt(j) != goal.charAt(j)) {
                    Found = false;  
                    break;  
                }
            }

            
            if (Found) {
                return true;
            }

            
            char firstChar = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(firstChar);
        }

        // If no match was found after all rotations, return false
       
    }
    return false;
    }
    }