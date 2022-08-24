// Example 1:

// Input: numbers = [2,7,11,15], target = 9
// Output: [1,2]
// Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
// Example 2:

// Input: numbers = [2,3,4], target = 6
// Output: [1,3]
// Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
// Example 3:

// Input: numbers = [-1,0], target = -1
// Output: [1,2]
// Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
  
  
  
  
  class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
      int[] output = new int[2];
      
      HashMap<Integer, Integer> hashmap = new HashMap<>();
      
      for(int i = 0 ; i < numbers.length; i++){
        if(hashmap.containsKey(target- numbers[i])){
            output[0] = hashmap.get(target- numbers[i]);
            output[1] = i + 1;
        }
        hashmap.put(numbers[i], i+1);
      }
      return output;
    }
}
