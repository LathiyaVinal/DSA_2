Example 1:

Input:
nums = {2, 8, 5, 4}
Output:
1
Explaination:
swap 8 with 4.
Example 2:

Input:
nums = {10, 19, 6, 3, 5}
Output:
2
Explaination:
swap 10 with 3 and swap 19 with 5.



class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        int temp[] = new int[nums.length];
        
        for(int i = 0 ; i < nums.length ; i++){
            temp[i] = nums[i];
        }
        
        Arrays.sort(temp);
        
        int ans  = 0;
        
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i =0 ; i< nums.length; i++){
            hashmap.put(nums[i], i);
        }
        
        for(int i = 0 ; i< nums.length ; i++){
            if(temp[i] != nums[i]){
                
                ans++;
                
                int indexX = i;
                int indexY = hashmap.get(temp[i]);
                
                int temp1 = nums[indexX];
                nums[indexX] = nums[indexY];
                nums[indexY] = temp1;
                
                hashmap.put(nums[indexX], indexX);
                hashmap.put(nums[indexY], indexY);
            }
        }
        
        return ans;
    }
}
