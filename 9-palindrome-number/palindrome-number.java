// class Solution {
//     public boolean isPalindrome(int x) 
//     {
//         int rev=0;
//         while(x>0)
//         {
//             int ld=x%10;
//             rev=(rev*10)+ld;
//             x=x/10;
//         }
//         if(x==rev)
       
//     }
//      return(true);
// }

class Solution {
    public boolean isPalindrome(int x) {

        // Negative numbers are not palindrome
        if (x < 0) {
            return false;
        }

        int original = x;   // store original value
        int rev = 0;

        while (x > 0) {
            int ld = x % 10;
            rev = (rev * 10) + ld;
            x = x / 10;
        }

        return original == rev;
    }
}
