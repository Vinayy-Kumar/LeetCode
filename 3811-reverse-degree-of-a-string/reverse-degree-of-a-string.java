class Solution {
    public int reverseDegree(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int reverseVal = 'z' - s.charAt(i) + 1;
            int product = (i + 1) * reverseVal;

            sum += product;
        }
        return sum;
    }
}