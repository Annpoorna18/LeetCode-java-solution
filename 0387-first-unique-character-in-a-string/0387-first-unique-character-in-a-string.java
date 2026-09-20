class Solution {
    public int firstUniqChar(String s) {
        // we can do it also like 242 that if 
        //first we will increse the count then 
        //count all letters, then find the first with count ==1
        int[] arr = new int[26] ;
        int sl = s.length();
        for (int i = 0; i < sl; i++) {
            arr[s.charAt(i) - 'a']++;

        }
        for (int i = 0; i < sl; i++) {
           if ( arr[s.charAt(i) - 'a'] == 1) {
            return i;
           }

        }
        return -1;
    }
}