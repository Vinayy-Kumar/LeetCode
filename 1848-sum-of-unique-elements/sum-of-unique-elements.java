class Solution {
    public int sumOfUnique(int[] nums) {
        int[] freq = new int[101];

        for (int x : nums) {
            freq[x]++;
        }
        int sum = 0;

        for (int num : nums) {
            if (freq[num] == 1) {
                sum += num;
            }
        }
        return sum;
    }
}