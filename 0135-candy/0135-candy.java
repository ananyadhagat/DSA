class Solution {
    public int candy(int[] ratings) {
        int n= ratings.length;
int[] arr= new int[n];
int count=n;
Arrays.fill(arr,1);
     for(int i=ratings.length-1; i>=0; i--){
        if(i==ratings.length-1){
            //check
           if(ratings[i-1]<ratings[i]){
            arr[i]++;
            count++;
           }

        }
        else if(i==0){
            if(ratings[i]>ratings[i+1]){
                arr[i]++;
                count++;
            }
        }
        else{
            if(ratings[i]>ratings[i-1]||ratings[i]>ratings[i+1]){
                arr[i]++;
                count++;
                if(ratings[i]<ratings[i+1]&&ratings[i]>ratings[i-1]){
                    if(arr[i]>=arr[i+1]){
                       arr[i+1]+= arr[i+1]+1;
                       count++;
                    }
                }
            }
        }
     }
return count;
    }
}