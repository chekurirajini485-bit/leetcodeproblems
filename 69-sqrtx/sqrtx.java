class Solution {
    public int mySqrt(int x) {
        
        int si = 0;
        int ei = x;

        int ans = 0;

        while(si <= ei) {
            int mid = ei + (si - ei) / 2;
            long temp = (long) mid * mid;

            if(temp == x) {
                return mid;
            }
            else if(temp < x) {
                si = mid + 1;
                ans = mid;
            }
            else {
                ei = mid - 1;
            }
        }

        return ans;
    }
}