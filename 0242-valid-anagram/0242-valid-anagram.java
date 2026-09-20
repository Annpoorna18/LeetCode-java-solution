class Solution {
    public boolean isAnagram(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        int[] arr = new int[26];

        if (sl != tl) {
            return false;
        }

        // from here we'll increse the value of each index
        // with the help of ascii value
        for (int i = 0; i < sl; i++) {
            arr[s.charAt(i) - 'a']++; // this means arr[o]==a   
                                      // will increse
        }
        
        for (int i = 0; i < tl; i++) {
            arr[t.charAt(i) - 'a']--;
            if (arr[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}