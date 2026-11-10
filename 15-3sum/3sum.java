class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            //to check if i or
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int low = i + 1;
            int high = nums.length - 1;

            while (low < high) {

                int sum = nums[i] + nums[low] + nums[high];

                if (sum == 0) {
                    l.add(Arrays.asList(nums[i], nums[low], nums[high]));

                    low++;
                    high--;
                    // by skipping duplicates;
                    while (low < high && nums[low] == nums[low - 1]) {
                        low++;
                    }

                    while (low < high && nums[high] == nums[high + 1]) {
                        high--;
                    }
                } else if (sum < 0) {
                    low++;
                } else {
                    high--;
                }
            }

        }

        return l;
    }
}