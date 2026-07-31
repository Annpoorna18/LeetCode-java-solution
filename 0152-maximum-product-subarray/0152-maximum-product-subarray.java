class Solution {
    public int maxProduct(int[] nums) {
       int leftProduct = 1;
       int rightProduct = 1;
       int ans = nums[0];
        for (int i = 0; i < nums.length; i++) {
         
         // condition that if left product or right product becomes 0 made
         // it 1 again with ternary operator
         leftProduct = leftProduct == 0 ? 1 : leftProduct;
         rightProduct = rightProduct == 0 ? 1 : rightProduct;

         leftProduct *= nums[i];
         rightProduct *= nums[nums.length-1-i];
         ans = Math.max(ans, Math.max(leftProduct, rightProduct));
        }
        return ans;
    }
}