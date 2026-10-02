class Solution {
    public boolean isSubsequence(String s, String t) {
       int p1 = 0;
       int p2 = 0;
       // two pointers approach
       int l1 = s.length();
       int l2 = t.length();
       while (p1 < l1 && p2 < l2) {
        if (s.charAt(p1) == t.charAt(p2)) {
            p1++;
            p2++;
        }
        else {
            p2++;
        }
        
       }
       return p1==l1;
    }
}