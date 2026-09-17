class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int deep = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (deep > 0) {
                    ans += c;
                }
                deep++;

            } else {
                deep--;
                if (deep > 0) {
                    ans += c;
                }
            }

        }
        return ans;
    }
}