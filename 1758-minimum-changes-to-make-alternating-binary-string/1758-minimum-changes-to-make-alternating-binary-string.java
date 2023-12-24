class Solution {
    public int minOperations(String s) {
        int start0 = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '1') {
                    start0++;
                }
            } else {
                if (s.charAt(i) == '0') {
                    start0++;
                }
            }
        }
        
        return Math.min(start0, s.length() - start0);
    }
}