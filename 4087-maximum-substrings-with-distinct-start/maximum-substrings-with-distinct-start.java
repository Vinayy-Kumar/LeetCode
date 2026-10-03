class Solution {
    public int maxDistinct(String s) {
        boolean[] have = new boolean[26];
        int count = 0;

        for (char c : s.toCharArray()) {
            if (!have[c - 'a']) {
                have[c - 'a'] = true;
                count++;
            }
        }
        return count;
    }
}