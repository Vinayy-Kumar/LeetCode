class Solution {
    public int[] diStringMatch(String s) {
     int n = s.length();
     int []arr = new int[n+1];
     int low = 0;
     int high = s.length();
     s.toCharArray();
     for(int i = 0 ; i < n ;i++){
        if(s.charAt(i)=='I'){
            arr[i] = low;
            low++;
        }
        else{
            arr[i] = high ;
            high--;
        }
     }   
     arr[s.length()] = low;
     return arr;
    }
}