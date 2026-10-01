class Solution {
    public int mostWordsFound(String[] sentences) {
         int max = 0;

        for (int i = 0; i < sentences.length; i++) {
            int ans = 0;
            for (int j = 0; j < sentences[i].length(); j++) {
                if (sentences[i].charAt(j) == ' ') {
                    ans++;
                }
            }
            ans++;
            max = Math.max(ans, max);
        }
        return max;
    }
}