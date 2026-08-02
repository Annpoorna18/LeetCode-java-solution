class Solution {
    public int majorityElement(int[] nums) {
        int max = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int maj = 0;
            for (int j = i+1; j< nums.length; j++) {
                if (nums[i] == nums[j]) {
                    maj = maj + 1;
                }
            }
           if (maj >= max) {
            max = maj;
            result = nums[i];
           } 
        }
        return result;
        
    }
}