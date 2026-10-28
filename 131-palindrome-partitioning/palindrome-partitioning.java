class Solution {
public List<List<String>> partition(String s) {
List<List<String>> ans = new ArrayList<>();
List<String> ll = new ArrayList<>();
  partitionHelper(s, ll, ans);
    return ans;
}

public static void partitionHelper(String ques, List<String> ll, List<List<String>> ans) {
    if (ques.length() == 0) {
        ans.add(new ArrayList<>(ll));
        return;
    }

    for (int cut = 1; cut <= ques.length(); cut++) {
        String s = ques.substring(0, cut);

        if (isPalindrome(s)) {
            ll.add(s);

            partitionHelper(ques.substring(cut), ll, ans);

            ll.remove(ll.size() - 1);
        }
    }
}

public static boolean isPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        left++;
        right--;
    }

    return true;
}

}
