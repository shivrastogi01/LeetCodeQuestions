class LengthOfLastWordOfString {
public int lengthOfLastWord(String s) {

    String noFinalWhitespace = s.trim();
    return noFinalWhitespace.substring(noFinalWhitespace.lastIndexOf(" ")+1).length();
}
}