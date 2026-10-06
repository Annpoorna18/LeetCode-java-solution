// class Solution {
//     public boolean checkValidString(String s) {
//         return helper(s, 0, 0);
//     }
//     private boolean helper(String s, int count, int index) {
//             if (count < 0) {
//                 return false;
//             }
//             if (index == s.length()) {
//                 return count == 0;
//             }
//             if (s.charAt(index) == '(') {
//                return helper(s, count+1, index+1);
//             }
//             else if (s.charAt(index) == ')') {
//                 return helper(s, count-1, index+1);
//             }
//             else {
//                 return helper(s, count-1, index+1) ||
//                        helper(s, count+1, index+1) || 
//                        helper(s, count, index+1);

//                 }
//             }
//         }  trhis was the recursive one

class Solution {
   public boolean checkValidString(String s) {   
    int min = 0;
    int max = 0;
    for (int i = 0; i < s.length(); i++) {
        int c = s.charAt(i);
        if (c == '(') {
            max++;
            min++;
        }
        else if (c == ')') {
            max--;
            min--;
        }
        else {
              max++;
              min--;
        }
        if (max < 0) {
            return false;
        }
        if (min < 0) {
            min = 0;
        }
    }
    return min == 0;
   }
}  
