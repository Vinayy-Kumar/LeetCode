class Solution {
    public int hammingWeight(int n) {
        int res = 0;
        while (n > 0) {
            int num = n % 2;
            if (num == 1) {
                res++;
            }
            n /= 2;
        }
        return res;
    }
}