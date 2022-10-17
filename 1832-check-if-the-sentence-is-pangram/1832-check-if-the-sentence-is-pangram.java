class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) return false;
        boolean[] map = new boolean[26];
        for (char a: sentence.toCharArray()) map[a - 'a'] = true;
        for(boolean i : map) if (!i) return false;
        return true;
    }
}