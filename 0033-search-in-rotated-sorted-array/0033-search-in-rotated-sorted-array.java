class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            // just do normal binary search because array is not rotated
            return binarySearch(nums, target, 0, nums.length-1);
        }
        else if (nums[pivot] == target) { 
            return pivot; 
        }
        //if target is greater than start
        else if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot-1);
        }
        else {
             return binarySearch(nums, target, pivot+1, nums.length-1);
        }
        
    }

    int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        while (start <= end) {
          int mid = start + (end - start)/2;
            if (mid < end && nums[mid] > nums[mid+1]) {
                return mid;
            }
            else if (mid > start && nums[mid] < nums[mid-1]) {
                return mid-1 ;
            }
             else if (nums[start] >= nums[mid]) {
               end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

        static int binarySearch(int nums[], int target, int start, int end) {
        while (start <= end ) {
            // find the middle element
            // (start + end)/2 may exceed the int range
            int mid = start + (end - start)/2;
            if (target < nums[mid]) {
                end = mid -1 ;
            }
            else if (target > nums[mid]) {
                start =mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}