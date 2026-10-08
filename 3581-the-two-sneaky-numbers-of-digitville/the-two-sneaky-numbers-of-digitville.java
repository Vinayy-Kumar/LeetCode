class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] freq = new int[nums.length];

        for (int num : nums) {
            freq[num]++;
        }
        int[] ans = new int[2];
        int index = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 2) {
                ans[index++] = i;
            }
        }
        return ans;
    }
}