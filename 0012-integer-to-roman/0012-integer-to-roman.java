class Solution {
    private static final StringBuilder sb = new StringBuilder(15);
    
    private static final String[] thou = {"", "M", "MM", "MMM"};
    private static final String[] hund = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC","DCCC","CM"};
    private static final String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX","LXX","LXXX","XC"};
    private static final String[] ones = {"", "I", "II", "III", "IV", "V", "VI","VII","VIII","IX"};
    
    public String intToRoman(int num) {
        sb.setLength(0);
        
        sb.append(thou[num/1000]);
        sb.append(hund[(num%1000)/100]);
        sb.append(tens[(num%100)/10]);
        sb.append(ones[num%10]);
        
        return sb.toString();
    }
}