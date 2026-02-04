class Solution {
    public int consecutiveNumbersSum(int n) {
        int count = 0;

        for (int k = 1; k * k <= n; k++) {
            if (n % k == 0) {
                // Check k
                if (k % 2 == 1) count++;

                // Check paired divisor n / k
                int other = n / k;
                if (other != k && other % 2 == 1) count++;
            }
        }

        return count;
    }
}