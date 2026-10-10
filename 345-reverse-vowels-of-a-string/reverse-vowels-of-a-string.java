class Solution {
    public String reverseVowels(String s) {
         char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;

        while (left < right) {
            while (left < right && !isVowels(ch[left])) {
                left++;
            }

            while (left < right && !isVowels(ch[right])) {
                right--;
            }
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;


        }
        return new String(ch);
    }

    public static boolean isVowels(char ch) {
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return  false;
    }


}