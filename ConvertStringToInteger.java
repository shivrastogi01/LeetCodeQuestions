class ConvertStringToInteger {
    public int myAtoi(String s) {
        final int len = s.length();
        if(len < 1) return 0;
        
        int i = 0, ret = 0;
        boolean sign = true; // true -> positive, false -> negative
        final int MAX = Integer.MAX_VALUE; // cache to avoid O(n) library calls
        final int MIN = Integer.MIN_VALUE;
        
        // move to the first non white space character
        while(i < len && s.charAt(i) == ' ') i++;
        if(i == len) return 0;
        
        // check the sign
        char c = s.charAt(i);
        if(c == '-' || c == '+')
            sign = (s.charAt(i++) == '+') ? true : false;
        
        for(; i<len; i++){
            c = s.charAt(i);

            // make sure c is a digit
            if(c < '0' || c > '9') break;

            if(sign){
                if(ret > (MAX - (c-'0'))/10) return MAX;
                ret = ret*10 + (c-'0');
            }
            else {
                if(ret < (MIN + (c-'0'))/10) return MIN;
                ret = ret*10 - (c-'0');
            }
        }
              
        return ret;
    }
}