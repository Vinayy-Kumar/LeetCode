class Solution {
    public int[] transformArray(int[] nums) {
        int count = 0;

        for (int x : nums) {
            if (x % 2 == 0) {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            nums[i] = 0;
        }
        for (int i = count; i < nums.length; i++) {
            nums[i] = 1;
        }

        return nums;
    }

}