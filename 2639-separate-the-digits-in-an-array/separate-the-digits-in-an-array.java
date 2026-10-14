class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> l1 = new ArrayList<>();

        for (int x : nums) {
            String s = String.valueOf(x);

            for (int i = 0; i < s.length(); i++) {
                l1.add(Integer.parseInt(String.valueOf(s.charAt(i))));
            }
        }
        int[] ans = new int[l1.size()];

        for (int i = 0; i < l1.size(); i++) {
            ans[i] = l1.get(i);
        }
        return ans;
    }

}