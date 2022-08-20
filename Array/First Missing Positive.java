// Example 1:

// Input: nums = [1,2,0]
// Output: 3
// Explanation: The numbers in the range [1,2] are all in the array.
// Example 2:

// Input: nums = [3,4,-1,1]
// Output: 2
// Explanation: 1 is in the array but 2 is missing.
// Example 3:

// Input: nums = [7,8,9,11,12]
// Output: 1
// Explanation: The smallest positive integer 1 is missing.
  
  
  class Solution {

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            nums[i] = 0;

            while (true) {
                if (x < 1 || x > n || x == nums[x - 1]) {
                    break;
                }

                int temp = nums[x - 1];
                nums[x - 1] = x;
                x = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                return i + 1;
            }
        }
        return n + 1;
    }
}
