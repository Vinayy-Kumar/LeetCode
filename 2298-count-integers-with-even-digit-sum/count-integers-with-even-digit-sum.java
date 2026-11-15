class Solution {
    public int countEven(int num) {
        int count = 0;
        for(int i = 1 ; i <= num ; i++) {
            if (digitSum(i)%2==0) {
                count++;
            }
        }
        return count;

    }

    public static int digitSum(int i) {
        int sum = 0;
        while (i != 0) {
            int digit = i % 10;
            sum += digit;
            i /= 10;
        }
        return sum;
    }

}