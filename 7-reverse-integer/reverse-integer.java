// class Solution {
//     public int reverse(int x) {
//        int rev=0;
//        while(x>0)
//        {
//         int ld=x%10;
//         rev=(rev*10)+ld;
//         x=x/10;
//        } 
//        return(rev);
//     }
// }


class Solution{
    public static int reverse(int num){   
       int res=0;
       while(num!=0){
        int digit=num%10;
        if(res>Integer.MAX_VALUE/10||res==Integer.MAX_VALUE&&digit>7)return 0;
        if(res<Integer.MIN_VALUE/10||res==Integer.MIN_VALUE&&digit<-8)return 0;
        res=res*10+digit;
        num/=10;
       }return res;
         
}}                       