class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != val) 
            {
                nums[index] = nums[i];
                index = index + 1;
                count = count + 1;
            }
        }
         for (int i = index; i < nums.length; i++)
         {
            nums[i] = val;
         }
         return count;
         
    }
}