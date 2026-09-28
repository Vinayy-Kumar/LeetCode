class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String []result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i].charAt(arr[i].length()-1);
            int num = ch - '0';
            result[num - 1] = arr[i].substring(0,arr[i].length()-1);
        }

        return String.join(" ",result); 
    }
}