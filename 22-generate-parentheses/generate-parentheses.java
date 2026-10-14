class Solution {
    List<String> answer = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        Parenthese(n, 0, 0, "");
        return answer;

    }


    public void Parenthese(int n, int open, int closed, String ans) {
        if (open == n && closed == n) {
            //  System.out.println(ans);
            answer.add(ans);
            return;
        }
        if (open > n || closed > open) {
            return;
        }
        Parenthese(n, open + 1, closed, ans + "(");
        Parenthese(n, open, closed + 1, ans + ")");

    }
}
