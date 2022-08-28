class Solution {

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        
        
        int negativeMax = nums[0] * nums[1] * nums[nums.length -1];
      
      
      return Math.max(max, negativeMax);
    }
}
