class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = start + (end - start)/2;
             // when left array is sorted
            if (nums[mid] >= nums[start]){
               ans = Math.min(ans,nums[start]);
               // then eliminate the left array
               start = mid + 1; 
            }
            //right array is sorted
            else {
                 ans = Math.min(ans,nums[mid]);
                 // eliminate the right array
                 end = mid - 1;
            }
        }
        return ans;
    }
}