class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        int num = 2;

        while (num <= n) {
            if(num%3==0 || num%5==0 || num%7==0){
                sum+=num;
            }
            num++;
        }
        return sum;
    }
}