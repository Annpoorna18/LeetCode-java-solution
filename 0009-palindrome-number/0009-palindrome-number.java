class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int original = x;
        if (x < 0) {
            return false; // -ve numbers are not palindrome
        }
        while (x != 0) {
        int digit = x % 10;
        reverse = reverse * 10 + digit ;
        x /= 10;
      }
     return original == reverse;
    }
}