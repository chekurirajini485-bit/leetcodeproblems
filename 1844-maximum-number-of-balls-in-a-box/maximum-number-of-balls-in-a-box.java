class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> boxCnt = new HashMap<>();
        int maxBalls = 0;
        for(int num = lowLimit; num <= highLimit; num++){
            int boxNum = getDigitSum(num);
            boxCnt.put(boxNum, boxCnt.getOrDefault(boxNum, 0) + 1);
            maxBalls = Math.max(maxBalls, boxCnt.get(boxNum));
        }
        return maxBalls;
    }
    private int getDigitSum(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}