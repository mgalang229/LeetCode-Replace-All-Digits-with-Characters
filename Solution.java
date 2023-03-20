class Solution {
    public String replaceDigits(String s) {
        char[] ss = s.toCharArray();
        for (int i = 1; i < ss.length; i += 2) {
            int prev = ss[i-1] - 'a';
            int toAdd = ss[i] - '0';
            char newLetter = (char) ((char) 'a' + (prev + toAdd) % 26);
            ss[i] = newLetter;
        }
        return String.valueOf(ss);
    }
}
