class Solution {
    public int minTimeToType(String word) {
        int n = word.length();
        int ans = 0;

        ans += Math.min(Math.abs(word.charAt(0) - 'a'), Math.abs(word.charAt(0) - 'a' - 26));
        ans += n;
        for (int i = 1; i < n; i++) {
            int d = Math.abs(word.charAt(i) - word.charAt(i - 1));
            int r = 26 - d;
            ans += Math.min(d, r);
        }

        return ans;
    }
}