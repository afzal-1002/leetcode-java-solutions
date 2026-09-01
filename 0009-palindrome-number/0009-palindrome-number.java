class Solution {
    public boolean isPalindrome(int n) {
        
            int rev =  0;
            int num = n;
            while( n > 0 )
            {   
                rev = rev * 10 + n %10;
                n = n / 10;
            }

        if(num == rev)
        {
            return(true);
        }

        return(false);
     }
}