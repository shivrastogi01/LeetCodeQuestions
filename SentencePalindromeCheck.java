class SentencePalindromeCheck {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String t=new String();
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>='a' && s.charAt(i)<='z')|| (s.charAt(i)>='0' && s.charAt(i)<='9'))
                t=t+s.charAt(i);
        }
        int i=0;
        int j=t.length()-1;
        while(i<j)
        {
            if(t.charAt(i)!=t.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}