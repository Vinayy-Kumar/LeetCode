class Solution {
    public int calculateScore(int a, int b) {
        int acount = 0;
        int bcount = 0;

        while (a > 0) {
            int x = a % 2;
            if (x == 1) {
                acount++;
            }
            a = a / 2;
        }
        while (b > 0) {
            int x = b % 2;
            if (x == 1) {
                bcount++;
            }
            b = b / 2;
        }

        if (acount >= bcount) {
            return acount * bcount;
        }
       
            return bcount / acount;
    }
}