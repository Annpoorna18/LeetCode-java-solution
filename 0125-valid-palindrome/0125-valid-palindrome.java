class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        s = s.toLowerCase();
        while (start <= end) {
            char ch = s.charAt(start);
            char chEnd = s.charAt(end);
            if (!Character.isLetterOrDigit(ch)) {
                start++;
            }
            else if(!Character.isLetterOrDigit(chEnd)) {
                end--;
            }
            else {
                if (ch == chEnd) {
                    start++;
                    end--;
                }
                else{
                    return false;
                }
            }
        }
       
       return true;
    }
}