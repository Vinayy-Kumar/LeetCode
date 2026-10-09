class Solution {
    public int[] shuffle(int[] nums, int n) {
        int left = 0;
        int right = n;
        int index = 0;

        int[] ans = new int[nums.length];
        while (left < n) {
            ans[index++] = nums[left++];
            ans[index++] = nums[right++];
        }
        return ans;
    }
}