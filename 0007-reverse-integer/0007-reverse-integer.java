class Solution {
    public int reverse(int x) {
        long num = 0; // we will take long so that if a number on reverse is larger than the range of int , we can check it after wards 
        while ( x != 0 ){ // this is to reverse the integer 
            int remainder = x%10;
            x = x/10;
            num = ( num*10 ) + remainder ;
        }
        if ( num < -2147483648 || num > 2147483647 ) return 0 ; // here we check if the reverse number exceeds the range of int we will return 0
        
        int ans = (int) num; // we will convert the long to int 
        if ( x < 0 ){ // check if the number is negatie so return with negative sign 
            return -ans; 
        }
        return ans ;
    }
}