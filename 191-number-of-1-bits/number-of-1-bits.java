class Solution {
    public int hammingWeight(int n) {
        int count=0;
        int binary=0;
        int place=1;
      while(n>0)
      {
        int rem=n%2;
        if(rem==1)
        count++;
        binary=binary+(rem*place);
        place=place*10;
        n=n/2;
      }  
      return count;
    }
}