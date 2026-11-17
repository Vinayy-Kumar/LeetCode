class Solution {
    public int search(int[] nums, int target) {
        return Bsearch(nums, target, 0, nums.length - 1);

    }

    public static int Bsearch(int[] nums, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (target == nums[m]) {
            return m;
        }

        if (target < nums[m]) {
            return Bsearch(nums, target, 0, m - 1);
        } else {
            return Bsearch(nums, target, m + 1, e);
        }
    }

}