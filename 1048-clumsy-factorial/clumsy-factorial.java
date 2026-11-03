class Solution {
    public int clumsy(int n) {
        int sum = 0;
        int temp = n;
        int op = 0;

        n--;

        while (n > 0) {

            if (op == 0) {
                temp = temp * n;
            }
            else if (op == 1) {
                temp = temp / n;
            }
            else if (op == 2) {
                sum += temp;
                temp = n;
            }
            else {
                sum += temp;
                temp = -n;
            }

            op = (op + 1) % 4;
            n--;
        }

        return sum + temp;
    }
}