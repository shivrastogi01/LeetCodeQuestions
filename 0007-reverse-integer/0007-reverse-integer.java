class Solution {
    public int reverse(int x) {
        long num = 0; 
        while ( x != 0 ){ // 
            int remainder = x%10;
            x = x/10;
            num = ( num*10 ) + remainder ;
        }
        if ( num < -2147483648 || num > 2147483647 ) return 0 ;
        
        int ans = (int) num; 
        if ( x < 0 ){ 
            return -ans; 
        }
        return ans ;
    }
}