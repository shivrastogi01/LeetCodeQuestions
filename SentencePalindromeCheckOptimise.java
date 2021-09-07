class SentencePalindromeCheckOptimise {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        
        while(i < j) {
            int a = (int) s.charAt(i);
            int b = (int) s.charAt(j);
            
            if(!isAlpha(a)) {
                i++;
            } else if(!isAlpha(b)) {
                j--;
            } else {
                //isAlpha(a) && isAlpha(b)
                if(a != b) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;        
    }
    
    public boolean isAlpha(int code) {
        return code >= 48 && code <= 57 || code >= 97 && code <= 122;
    }
}