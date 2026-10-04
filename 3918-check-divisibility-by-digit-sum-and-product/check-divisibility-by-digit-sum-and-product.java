class Solution {
    public boolean checkDivisibility(int n) {
        int k = n;
        int sum = 0;
        int pro = 1;
        while (k != 0) {
            int temp = k % 10;
            sum += temp;
            pro *= temp;
            k = k / 10;
        }
        return n % (sum + pro) == 0;
    }
}