class Solution {
    public String restoreString(String s, int[] indices) {
        char []ans = s.toCharArray();
        for(int i = 0 ; i < s.length() ; i++){
           ans[indices[i]] = s.charAt(i);
        }
    
    return new String(ans);
    }
}