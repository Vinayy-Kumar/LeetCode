class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = 100;
        int max = 0;

        Set<Integer> map = new HashSet<>();

        for (int x : nums) {
            min = Math.min(min, x);
            max = Math.max(max, x);
            map.add(x);
        }

        List<Integer> l1 = new ArrayList<>();

        for (int i = min + 1; i < max; i++) {
            if (!map.contains(i)) {
                l1.add(i);
            }
        }
        return l1;
    }
}