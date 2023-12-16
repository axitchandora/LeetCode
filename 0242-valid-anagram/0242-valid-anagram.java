class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] charCountS = new int[26];
        int[] charCountT = new int[26];
        for (char c : s.toCharArray()) {
            charCountS[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            charCountT[c - 'a']++;
        }
        return Arrays.equals(charCountS, charCountT);
    }
}